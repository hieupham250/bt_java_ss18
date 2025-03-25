import java.util.*;

public class Bai5 {
    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<>();
        products.put("Laptop", 1500.0);
        products.put("Smartphone", 800.0);
        products.put("Tablet", 600.0);
        products.put("Headphones", 200.0);
        products.put("Smartwatch", 250.0);

        List<Map.Entry<String, Double>> filteredProducts = new ArrayList<>();
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            if (entry.getValue() >= 500 && entry.getValue() <= 1500) {
                filteredProducts.add(entry);
            }
        }

        filteredProducts.sort(Comparator.comparingDouble(Map.Entry::getValue));

        System.out.println("Danh sách sản phẩm trong khoảng giá 500 - 1500, sắp xếp theo giá tăng dần:");
        for (Map.Entry<String, Double> entry : filteredProducts) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
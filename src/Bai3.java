import java.util.LinkedHashMap;

public class Bai3 {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> products = new LinkedHashMap<>();
        products.put("Laptop", 1500.0);
        products.put("Smartphone", 800.0);
        products.put("Tablet", 600.0);
        products.put("Headphones", 200.0);
        products.put("Smartwatch", 250.0);

        System.out.println("Danh sách sản phẩm ban đầu:");
        for (String key : products.keySet()) {
            System.out.println(key + " - " + products.get(key));
        }

        products.put("Laptop", 1400.0);
        System.out.println("Sau khi cập nhật giá Laptop:");
        for (String key : products.keySet()) {
            System.out.println(key + " - " + products.get(key));
        }

        products.remove("Headphones");
        System.out.println("Sau khi xóa Headphones:");
        for (String key : products.keySet()) {
            System.out.println(key + " - " + products.get(key));
        }
    }
}




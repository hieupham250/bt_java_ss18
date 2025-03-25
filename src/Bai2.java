import java.util.HashMap;
import java.util.Map;

public class Bai2 {
    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<>();
        products.put("Laptop", 10000.0);
        products.put("Samsung", 20000.0);
        products.put("Sony", 30000.0);
        products.put("iphone", 40000.0);

        String searchName = "Laptop";
        if (products.containsKey(searchName)) {
            System.out.println("Trong map có " + searchName);
        } else {
            System.out.println("Trong map không có " + searchName);
        }

        double price = 1000.0;
        if (products.containsValue(price)) {
            System.out.println("Trong map có sản phẩm giá " + price);
        } else {
            System.out.println("Trong map không có sản phẩm giá " + price);
        }
    }
}

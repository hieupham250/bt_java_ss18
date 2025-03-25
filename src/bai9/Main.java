package bai9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Product> products = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("---------- MENU ----------");
            System.out.println("1. Thêm sản phẩm mới");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tính tổng giá trị sản phẩm trong kho");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addProduct(products, sc);
                    break;
                case 2:
                    displayProducts(products);
                    break;
                case 3:
                    updateProduct(products, sc);
                    break;
                case 4:
                    deleteProduct(products, sc);
                    break;
                case 5:
                    calculateTotalValue(products);
                    break;
                case 0:
                    System.out.println("Kết thúc chương trình");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại");
            }
        } while (true);
    }

    public static void addProduct(Map<Integer, Product> products, Scanner sc) {
        System.out.print("Nhập mã sản phẩm: ");
        int id = sc.nextInt();
        sc.nextLine();
        if (products.containsKey(id)) {
            System.out.println("mã sản phẩm đã tồn tại!");
            return;
        }
        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        double price;
        do {
            System.out.print("Nhập giá sản phẩm: ");
            price = sc.nextDouble();
            if (price <= 0) {
                System.out.println("Giá sản phẩm phải lớn hơn 0!");
            }
        } while (price <= 0);
        int quantity;
        do {
            System.out.print("Nhập số lượng sản phẩm: ");
            quantity = sc.nextInt();
            if (quantity < 0) {
                System.out.println("Số lượng không thể âm!");
            }
        } while (quantity < 0);
        products.put(id, new Product(id, name, price, quantity));
        System.out.println("Sản phẩm đã được thêm thành công!");
    }

    public static void displayProducts(Map<Integer, Product> products) {
        if (products.isEmpty()) {
            System.out.println("Không có sản phẩm nào trong kho!");
            return;
        }
        System.out.println("Danh sách sản phẩm:");
        for (Product product : products.values()) {
            System.out.println("---------------------------");
            System.out.println(product);
        }
    }

    public static void updateProduct(Map<Integer, Product> products, Scanner sc) {
        System.out.print("Nhập mã sản phẩm cần cập nhật: ");
        int id = sc.nextInt();
        if (!products.containsKey(id)) {
            System.out.println("Sản phẩm không tồn tại!");
            return;
        }
        Product product = products.get(id);
        System.out.println("Sản phẩm hiện tại: " + product);
        do {
            System.out.println("---------- MENU UPDATE ----------");
            System.out.println("1. Số lượng");
            System.out.println("2. Giá");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int newQuantity;
                    do {
                        System.out.print("Nhập số lượng mới: ");
                        newQuantity = sc.nextInt();
                        if (newQuantity < 0) {
                            System.out.println("Số lượng không thể âm");
                        }
                    } while (newQuantity < 0);
                    product.setQuantity(newQuantity);
                    System.out.println("Cập nhật thành công");
                    break;
                case 2:
                    double newPrice;
                    do {
                        System.out.print("Nhập giá mới: ");
                        newPrice = sc.nextDouble();
                        if (newPrice <= 0) {
                            System.out.println("Giá sản phẩm phải lớn hơn 0");
                        }
                    } while (newPrice <= 0);
                    product.setPrice(newPrice);
                    System.out.println("Cập nhật thành công");
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (true);
    }

    public static void deleteProduct(Map<Integer, Product> products, Scanner sc) {
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        int id = sc.nextInt();
        if (!products.containsKey(id)) {
            System.out.println("Sản phẩm không tồn tại!");
            return;
        }
        products.remove(id);
        System.out.println("Sản phẩm đã được xóa!");
    }

    public static void calculateTotalValue(Map<Integer, Product> products) {
        double totalValue = 0;
        for (Product product : products.values()) {
            totalValue += product.getPrice() * product.getQuantity();
        }
        System.out.println("Tổng giá trị kho hàng: " + totalValue);
    }
}

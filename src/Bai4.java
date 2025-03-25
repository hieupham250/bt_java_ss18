import java.util.TreeMap;

public class Bai4 {
    public static void main(String[] args) {
        TreeMap<String, Double> employees = new TreeMap<>();
        employees.put("NV121", 10000.0);
        employees.put("NV123", 20000.0);
        employees.put("NV122", 30000.0);
        employees.put("NV125", 40000.0);
        employees.put("NV124", 50000.0);

        System.out.println("Danh sách nhân viên ban đầu:");
        for (String key : employees.keySet()) {
            System.out.println("Mã nhân viên: " + key + " - Lương: " + employees.get(key));
        }

        employees.put("NV123", 9500.0);
        System.out.println("Sau khi cập nhật lương của NV123:");
        for (String key : employees.keySet()) {
            System.out.println("Mã nhân viên: " + key + " - Lương: " + employees.get(key));
        }

        employees.remove("NV121");
        System.out.println("Sau khi xóa nhân viên NV121:");
        for (String key : employees.keySet()) {
            System.out.println("Mã nhân viên: " + key + " - Lương: " + employees.get(key));
        }
    }
}

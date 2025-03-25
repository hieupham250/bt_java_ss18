import java.util.HashMap;
import java.util.Map;

public class Bai1 {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Nguyễn Văn A", 9);
        students.put("Nguyễn Văn B", 8);
        students.put("Nguyễn Văn C", 7);
        students.put("Nguyễn Văn D", 6);
        students.put("Nguyễn Văn E", 5);

        for (String key : students.keySet()) {
            System.out.println("Tên: " + key + " - điểm: " + students.get(key));
        }

        String searchName = "Nguyễn Văn A";
        if (students.containsKey(searchName)) {
            System.out.println("Điểm số của " + searchName + ": " + students.get(searchName));
        } else {
            System.out.println(searchName + " không có trong danh sách.");
        }
    }
}

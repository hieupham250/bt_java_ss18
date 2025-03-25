import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Bai6 {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> studentScores = new LinkedHashMap<>();
        studentScores.put("Nguyen Van A", 7.5);
        studentScores.put("Tran Thi B", 8.0);
        studentScores.put("Le Van C", 6.5);
        studentScores.put("Pham Thi D", 4.5);
        studentScores.put("Hoang Van E", 9.0);
        studentScores.put("Do Thi F", 3.5);
        studentScores.put("Bui Van G", 5.5);
        studentScores.put("Nguyen Thi H", 7.0);
        studentScores.put("Tran Van I", 4.0);
        studentScores.put("Le Thi J", 6.0);

        for (String key : studentScores.keySet()) {
            System.out.println("Tên: " + key + " -điểm: " + studentScores.get(key));
        }

        double totalScore = 0;
        for (double score : studentScores.values()) {
            totalScore += score;
        }

        double averageScore = totalScore / studentScores.size();
        System.out.println("Điểm trung bình của tất cả học sinh: " + averageScore);

        Iterator<Map.Entry<String, Double>> iterator = studentScores.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() < 5.0) {
                iterator.remove();
            }
        }

        System.out.println("Danh sách học sinh sau khi xóa những người có điểm dưới 5:");
        for (String key : studentScores.keySet()) {
            System.out.println("Tên: " + key + " - điểm: " + studentScores.get(key));
        }

    }
}

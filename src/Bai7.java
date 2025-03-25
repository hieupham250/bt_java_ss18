import java.util.*;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Nhập N phần tử: ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0) {
                    break;
                }
                System.out.println("Giá trị N không hợp lệ. Vui lòng nhập lại");
            }
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
        entryList.sort(Comparator.comparingInt(Map.Entry::getValue));
        System.out.println("Các phần tử theo số lần xuất hiện tăng dần:");
        for (Map.Entry<Integer, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

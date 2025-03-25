import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("Nhập số nguyên dương (1 - 3999): ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n > 0 && n <= 3999) {
                    break;
                }
                System.out.println("Giá trị N không hợp lệ. Vui lòng nhập lại");
            }
        }

        LinkedHashMap<Integer, String> romanMap = new LinkedHashMap<>();
        romanMap.put(1000, "M");
        romanMap.put(900, "CM");
        romanMap.put(500, "D");
        romanMap.put(400, "CD");
        romanMap.put(100, "C");
        romanMap.put(90, "XC");
        romanMap.put(50, "L");
        romanMap.put(40, "XL");
        romanMap.put(10, "X");
        romanMap.put(9, "IX");
        romanMap.put(5, "V");
        romanMap.put(4, "IV");
        romanMap.put(1, "I");

        StringBuilder romanNumeral = new StringBuilder();
        for (Map.Entry<Integer, String> entry : romanMap.entrySet()) {
            while (n >= entry.getKey()) {
                romanNumeral.append(entry.getValue());
                n -= entry.getKey();
            }
        }

        System.out.println(romanNumeral.toString());
    }
}

package bai10;

import bai9.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Employee> employees = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        employees.put(1, new Employee("Nguyễn Văn A", 12000));
        employees.put(2, new Employee("Trần Thị B", 15000));
        employees.put(3, new Employee("Lê Văn C", 10000));
        do {
            System.out.println("---------- MENU ----------");
            System.out.println("1. Thêm nhân viên mới");
            System.out.println("2. Hiển thị danh sách nhân viên");
            System.out.println("3. Tính tổng lương của tất cả nhân viên");
            System.out.println("4. Tính lương trung bình");
            System.out.println("5. Tìm nhân viên có lương cao nhất");
            System.out.println("6. Tìm nhân viên có lương thấp nhất");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addEmployee(employees, sc);
                    break;
                case 2:
                    displayEmployees(employees);
                    break;
                case 3:
                    calculateTotalSalary(employees);
                    break;
                case 4:
                    calculateAverageSalary(employees);
                    break;
                case 5:
                    findHighestSalaryEmployee(employees);
                    break;
                case 6:
                    findLowestSalaryEmployee(employees);
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

    public static void addEmployee(Map<Integer, Employee> employees, Scanner sc) {
        System.out.print("Nhập tên nhân viên: ");
        String name = sc.nextLine();
        double salary;
        do {
            System.out.print("Nhập lương nhân viên: ");
            salary = sc.nextDouble();
            sc.nextLine();
            if (salary <= 0) {
                System.out.println("Lương phải lớn hơn 0!");
            }
        } while (salary <= 0);

        Employee employee = new Employee(name, salary);
        employees.put(employee.getId(), employee);
        System.out.println("Thêm nhân viên thành công");
    }

    public static void displayEmployees(Map<Integer, Employee> employees) {
        if (employees.isEmpty()) {
            System.out.println("Không có nhân viên nào trong danh sách!");
            return;
        }
        System.out.println("Danh sách sản phẩm:");
        for (Employee employee : employees.values()) {
            System.out.println("---------------------------");
            System.out.println(employee);
        }
    }

    public static void calculateTotalSalary(Map<Integer, Employee> employees) {
        if (employees.isEmpty()) {
            System.out.println("Không có nhân viên nào trong danh sách!");
            return;
        }
        double totalSalary = 0;
        for (Employee employee : employees.values()) {
            totalSalary += employee.getSalary();
        }
        System.out.println("Tổng lương của tất cả nhân viên: " + totalSalary);
    }

    public static void calculateAverageSalary(Map<Integer, Employee> employees) {
        if (employees.isEmpty()) {
            System.out.println("Không có nhân viên nào trong danh sách!");
            return;
        }
        double totalSalary = 0;
        for (Employee employee : employees.values()) {
            totalSalary += employee.getSalary();
        }
        double averageSalary = totalSalary / employees.size();
        System.out.println("Lương trung bình: " + String.format("%.1f", averageSalary));
    }

    public static void findHighestSalaryEmployee(Map<Integer, Employee> employees) {
        if (employees.isEmpty()) {
            System.out.println("Không có nhân viên nào trong danh sách!");
            return;
        }
        Employee highestSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee : employees.values()) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                highestSalaryEmployee = employee;
            }
        }
        System.out.println("Nhân viên có lương cao nhất: " + highestSalaryEmployee);
    }

    public static void findLowestSalaryEmployee(Map<Integer, Employee> employees) {
        if (employees.isEmpty()) {
            System.out.println("Không có nhân viên nào trong danh sách!");
            return;
        }
        Employee lowestSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;

        for (Employee employee : employees.values()) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                lowestSalaryEmployee = employee;
            }
        }

        System.out.println("Nhân viên có lương thấp nhất: " + lowestSalaryEmployee);
    }
}

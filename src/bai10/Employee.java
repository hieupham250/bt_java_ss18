package bai10;

public class Employee {
    private static int idCounter = 1;
    private int id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.id = idCounter++;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Mã NV: " + id + ", Tên: " + name + ", Lương: " + salary;
    }
}

package lab_2.data;

public class Employee extends Person {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
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

    public void work() {
        System.out.println("Employee is working.");
    }

    public void increaseSalary(double percentage) {
        salary += salary * (percentage / 100);
    }

    public void displayInfo() {
        System.out.println("Employee: Name = " + name + ", Salary = " + salary);
    }
}
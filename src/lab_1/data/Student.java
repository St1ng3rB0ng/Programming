package lab_1.data;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Student ID: " + studentId);
    }

    public void study() {
        System.out.println(name + " is studying.");
    }
}

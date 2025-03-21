package lab_1;

//          Задача 1: Створіть клас Student, успадкований від класу Person. Додайте поле
//        studentId та метод displayStudentInfo(), який виводить інформацію про студента.
//          Задача 2: Розширте клас Student, додавши конструктор, який викликає
//        конструктор батьківського класу, та метод study(), який виводить повідомлення про
//        навчання студента.
//          Задача 3: Створіть клас Rectangle з приватними полями length та width.
//        Надайте методи доступу до цих полів та створіть екземпляр класу для виведення
//        інформації про прямокутник.
//          Задача 4: Створіть підклас Square від класу Rectangle, який має захищене поле
//        sideLength. Створіть екземпляр класу Square та виведіть інформацію про квадрат.

public class Main {
    public static void main(String[] args) {
        // Task 1 & 2
        Student student = new Student("Ivan", 20, "S_12345");
        student.displayStudentInfo();
        student.study();

        // Task 3
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        rectangle.displayInfo();

        // Task 4
        Square square = new Square(4.0);
        square.displayInfo();
    }
}

package lab_2;

//          Завдання 1: 9. Створіть клас Shape з методами calculateArea та displayInfo.
//        Створіть підклас Triangle, який успадковує клас Shape та має додаткові поля base та
//        height. Реалізуйте методи для обчислення площі та виведення інформації про
//        трикутник. Створіть об'єкт класу Triangle та викличте методи.
//          Завдання 2: Створіть клас Person з методами eat та sleep. Створіть підклас
//        Employee, який успадковує клас Person та має додатковий метод work. Створіть об'єкт
//        класу Employee та викличте всі методи.
//          Завдання 3: Створіть клас Employee, який містить приватні поля для імені та
//        заробітної плати працівника. Забезпечте інкапсуляцію цих полів та додайте методи
//        доступу. Створіть об'єкт класу та виведіть інформацію про працівника.
//          Завдання 4: Розширте клас Employee, додавши метод, який збільшує заробітну
//        плату працівника на певний відсоток. Виведіть оновлену інформацію про працівника.

public class Main {
    public static void main(String[] args) {
        // Task 1
        Triangle triangle = new Triangle(5.0, 3.0);
        triangle.displayInfo();

        // Task 2
        Employee employee = new Employee("Олег", 30000);
        employee.eat();
        employee.sleep();
        // 3 & 4
        employee.work();
        employee.displayInfo();
        employee.increaseSalary(10);
        employee.displayInfo();
    }
}

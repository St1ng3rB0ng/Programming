package lab_4;

//          Завдання 1: Створіть абстрактний клас GeometricShape з абстрактним методом
//        calculatePerimeter(). Створіть підкласи Triangle та Rectangle, які реалізують метод
//        calculatePerimeter() для розрахунку периметру трикутника та прямокутника
//        відповідно.
//          Завдання 2: Створіть абстрактний клас BankTransaction з абстрактним методом
//        processTransaction(). Створіть підкласи Deposit та Withdrawal, які реалізують метод
//        processTransaction() для обробки операцій внесення та зняття грошей відповідно.
//          Завдання 3: Створіть інтерфейс Calculator з методами add(int a, int b) та
//        subtract(int a, int b). Створіть клас BasicCalculator та реалізуйте інтерфейс Calculator
//        для нього. Виведіть результат виклику методів.
//          Завдання 4: Створіть інтерфейс Connectable з методом
//        connectToNetwork(String network). Створіть клас Smartphone та реалізуйте інтерфейс
//        Connectable для нього. Виведіть результат роботи методу connectToNetwork().

import lab_4.data.*;

public class Main {
    public static void main(String[] args) {
        // Task 1
        GeometricShape triangle = new Triangle(3, 4, 5);
        GeometricShape rectangle = new Rectangle(4, 6);
        System.out.println(triangle.calculatePerimeter());
        System.out.println(rectangle.calculatePerimeter());

        // Task 2
        BankTransaction deposit = new Deposit(1000);
        deposit.processTransaction(500);
        System.out.println(deposit.getBalance());
        BankTransaction withdrawal = new Withdrawal(1000);
        withdrawal.processTransaction(300);
        System.out.println(withdrawal.getBalance());

        // Task 3
        Calculator calc = new BasicCalculator();
        System.out.println(calc.add(10, 5));
        System.out.println(calc.subtract(10, 5));

        // Task 4
        Connectable phone = new Smartphone();
        phone.connectToNetwork("Wi-Fi");
    }
}
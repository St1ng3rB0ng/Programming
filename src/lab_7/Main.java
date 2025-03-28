package lab_7;

import lab_7.data.Book;
import lab_7.data.Printable;
import lab_7.data.Operation;

import java.util.ArrayList;

//          1. Задача: Анонімний клас для роботи з інтерфейсом
//        Створіть інтерфейс Printable, який має метод print(String message). Створіть
//        анонімний клас для цього інтерфейсу, який виводить повідомлення в оберненому
//        порядку (від останнього символу до першого).
//          2. Задача: Лямбда вираз для фільтрації об'єктів класу
//        Створіть клас Book з полями title та pageCount. Створіть список об'єктів Book та
//        використовуючи лямбда вираз, відфільтруйте та виведіть ті книги, які мають більше
//        300 сторінок.
//          3. Задача: Лямбда вираз для обчислення виразу
//        Створіть лямбда вираз, який приймає два параметри типу double та обчислює
//        вираз (a + b) * 2

public class Main {
    public static void main(String[] args) {
        //Task 1
        Printable printable = new Printable() {
            @Override
            public void print(String message) {
                StringBuilder sb = new StringBuilder(message);
                sb.reverse();
                System.out.println(sb.toString());
            }
        };
        printable.print("Ave Java!");

        //Task 2
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Java", 412));
        books.add(new Book("Python", 122));
        books.add(new Book("C", 543));
        books.stream()
                .filter(book -> book.getPageCount() > 300)
                .forEach(book -> System.out.println(book.getTitle()));

        //Task 3
        Operation operation = (a, b) -> (a + b) * 2;

        double a = 20;
        double b = 90;
        double res = operation.calculate(a, b);

        System.out.println("Result: " + res);


    }
}


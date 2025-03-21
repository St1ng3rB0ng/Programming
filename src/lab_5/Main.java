package lab_5;

//          1. Реалізуйте узагальнений метод для сортування масиву об'єктів будь-якого типу
//        за зростанням або спаданням.
//          2. Створіть узагальнений клас "Звіт" (Report), який містить дані будь-якого типу
//        та може генерувати звіт у різних форматах (наприклад, текстовий або HTML).
//          3. Створіть Record для представлення студента з полями для імені, прізвища та
//        курсу. Створіть список студентів та відсортуйте його спочатку за курсом, а
//        потім за іменем.
//          4. Створіть Record для представлення книги з полями для назви та ціни. Реалізуйте
//        метод для обчислення вартості книги

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Integer[] intArray = {5, 2, 8, 1};
        String[] strArray = {"Z", "A", "M"};
        Sorter.sort(intArray, true);
        Sorter.sort(strArray, false);
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(strArray));

        // Task 2
        Report<String> textReport = new Report<>("Text Data");
        Report<Integer> numberReport = new Report<>(123);
        textReport.generateTextReport();
        textReport.generateHtmlReport();
        numberReport.generateTextReport();
        numberReport.generateHtmlReport();

        // Task 3
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anna", "Smith", 2));
        students.add(new Student("Bruce", "Eckel", 1));
        students.add(new Student("Clara", "Smith", 2));
        students.sort((s1, s2) -> {
            int courseCompare = Integer.compare(s1.course(), s2.course());
            return courseCompare != 0 ? courseCompare : s1.name().compareTo(s2.name());
        });
        System.out.println(students);

        // Task 4
        Book book = new Book("Thinking in Java", 29.99);
        System.out.println(book.calculateCost(2));
    }
}
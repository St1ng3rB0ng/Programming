package lab_3;

//          Задача 1: Запис даних з використанням поліморфізму Створіть абстрактний
//        клас Writer, що має абстрактний метод write(). Створіть класи TextWriter та
//        BinaryWriter, які наслідуються від Writer та реалізують метод write() для запису
//        текстових і бінарних даних, відповідно.
//          Задача 2: Контейнер для об'єктів з поліморфізмом Створіть клас-контейнер
//        ObjectContainer, який може містити об'єкти будь-якого класу. Реалізуйте метод для
//        виведення інформації про всі об'єкти в контейнері.
//          Задача 3: Робота зі списками Створіть клас ListProcessor, який має метод
//        processList(), який приймає список цілих чисел та виконує певні операції з елементами
//        списку. Перевантажте метод для роботи зі списками різних типів.
//          Задача 4: Порівняння об'єктів Створіть клас ObjectComparator, який має метод
//        compareObjects(), що порівнює два об'єкти. Перевантажте цей метод для різних типів
//        об'єктів.

import lab_3.data.*;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Writer textWriter = new TextWriter();
        Writer binaryWriter = new BinaryWriter();
        textWriter.write();
        binaryWriter.write();

        // Task 2
        ObjectContainer container = new ObjectContainer();
        container.add(42);
        container.add("Text");
        container.add(3.14);
        container.displayInfo();

        // Task 3
        ListProcessor processor = new ListProcessor();
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        processor.processList(intList,8);
        List<String> strList = new ArrayList<>();
        strList.add("A");
        strList.add("B");
        processor.processList(strList);

        // Task 4
        ObjectComparator comparator = new ObjectComparator();
        System.out.println(comparator.compareObjects(5, 5));
        System.out.println(comparator.compareObjects("A", "B"));
    }
}
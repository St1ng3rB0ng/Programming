package lab_6;

//          1. TreeMap: Створіть TreeMap для зберігання пар "країна - столиця".
//        Додайте три різні пари та виведіть їх у алфавітному порядку країн.
//           2. ArrayList: Створіть ArrayList для зберігання рейтингу книг. Додайте
//        5 різних книг, видаліть одну та виведіть залишок.
//          3. HashSet: Створіть HashSet для зберігання цілих чисел. Додайте 5
//        різних чисел, видаліть одне та виведіть залишок.
//          4. Queue: Створіть Queue для зберігання об'єктів "завдання". Додайте
//         два різних завдання та виведіть їх у порядку виконання

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Task 1
        TreeMap<String, String> countryCapitalMap = new TreeMap<>();
        countryCapitalMap.put("Ukraine", "Kyiv");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("France", "Paris");
        System.out.println("(TreeMap): " + countryCapitalMap);

        // Task 2
        ArrayList<String> bookRatings = new ArrayList<>();
        bookRatings.add("Book A");
        bookRatings.add("Book B");
        bookRatings.add("Book C");
        bookRatings.add("Book D");
        bookRatings.add("Book E");
        bookRatings.add(1,"Book First");
        bookRatings.remove("Book C");
        bookRatings.remove(2);
        System.out.println("(ArrayList): " + bookRatings);

        // Task 3
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(121);
        numbers.add(233);
        numbers.add(3321);
        numbers.add(421);
        numbers.add(511);
        numbers.remove(233);
        System.out.println("(HashSet): " + numbers);

        // Task 4
        Queue<String> tasks = new LinkedList<>();
        tasks.add("Task 1");
        tasks.add("Task 2");
        System.out.println("Queue by LinkedList");
        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll());
        }
    }
}

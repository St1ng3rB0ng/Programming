package lab_5;

import java.util.Arrays;

public class Sorter {
    public static <T extends Comparable<T>> void sort(T[] array, boolean ascending) {
        Arrays.sort(array);
        if (!ascending) {
            for (int i = 0; i < array.length / 2; i++) {
                T temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = temp;
            }
        }
    }
}
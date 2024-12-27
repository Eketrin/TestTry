package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Массив целых чисел
        Integer[] intArray = {5, 2, 8, 1, 3};
        SortUtil.sortArray(intArray);
        System.out.println("Отсортированный массив целых чисел: " + Arrays.toString(intArray));

        // Массив чисел типа double
        Double[] doubleArray = {5.5, 2.2, 8.8, 1.1, 3.3};
        SortUtil.sortArray(doubleArray);
        System.out.println("Отсортированный массив чисел типа double: " + Arrays.toString(doubleArray));

        // Массив символов
        Character[] charArray = {'d', 'a', 'c', 'b', 'e'};
        SortUtil.sortArray(charArray);
        System.out.println("Отсортированный массив символов: " + Arrays.toString(charArray));

        // Массив строк
        String[] stringArray = {"banana", "apple", "orange", "grape", "kiwi"};
        SortUtil.sortArray(stringArray);
        System.out.println("Отсортированный массив строк: " + Arrays.toString(stringArray));

    }
}

//                          я без понятия что ей нужно конкретно,
//                          тут реализация через встроенную сортировку, ниже сортировка "вручную"
//class SortUtil {
//    // Обобщенный метод сортировки
//    public static <T extends Comparable<T>> void sortArray(T[] array) {
//        Arrays.sort(array);
//    }
//}

class SortUtil {
    // Обобщенный метод сортировки (сортировка пузырьком)
    public static <T extends Comparable<T>> void sortArray(T[] array) {

        int n = array.length;
        // Внешний цикл, который проходит по всему массиву
        for (int i = 0; i < n - 1; i++) {
            // Внутренний цикл для сравнения соседних элементов
            for (int j = 0; j < n - 1 - i; j++) {
                // Сравниваем текущий элемент со следующим
                // Если текущий элемент больше следующего, то нужно поменять их местами
                if (array[j].compareTo(array[j + 1]) > 0) {
                    // Меняем местами
                    T temp = array[j]; // Сохраняем текущий элемент во временной переменной
                    array[j] = array[j + 1]; // Перемещаем следующий элемент на место текущего
                    array[j + 1] = temp; // Устанавливаем сохраненный элемент на место следующего
                }
            }
        }
    }
}


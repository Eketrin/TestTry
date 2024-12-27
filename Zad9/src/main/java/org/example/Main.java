package org.example;


public class Main {
    public static int linearSearch(int[] array, int target) {
        // Проходим по каждому элементу массива
        for (int i = 0; i < array.length; i++) {
            // Если элемент найден, возвращаем его индекс
            if (array[i] == target) {
                return i;
            }
        }
        // Если элемент не найден, возвращаем -1
        return -1;
    }
    public static void main(String[] args) {
        // Пример использования
        int[] numbers = {5, 3, 8, 1, 2, 7};
        int target = 1;

        int index = linearSearch(numbers, target);
        if (index != -1) {
            System.out.println("Элемент " + target + " найден на позиции: " + index);
        } else {
            System.out.println("Элемент " + target + " не найден в массиве.");
        }

        // Пример поиска элемента, которого нет в массиве
        target = 6;
        index = linearSearch(numbers, target);
        if (index != -1) {
            System.out.println("Элемент " + target + " найден на позиции: " + index);
        } else {
            System.out.println("Элемент " + target + " не найден в массиве.");
        }
    }
}
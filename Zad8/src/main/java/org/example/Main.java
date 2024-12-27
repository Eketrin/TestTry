package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        ArrayList<T> uniqueList = new ArrayList<>();

        for (T item : list) {
            // Проверяем, содержится ли элемент уже в уникальном списке
            if (!uniqueList.contains(item)) {
                uniqueList.add(item); // Добавляем только уникальные элементы
            }
        }

        return uniqueList;
    }

    public static void main(String[] args) {
        // Пример использования
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);

        System.out.println("Исходный список: " + numbers);
        ArrayList<Integer> uniqueNumbers = removeDuplicates(numbers);
        System.out.println("Список без дубликатов: " + uniqueNumbers);
    }
}

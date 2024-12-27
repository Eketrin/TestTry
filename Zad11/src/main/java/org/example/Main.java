package org.example;

public class Main {
    public static void main(String[] args) {
        // Пример использования
        Digits[][] digits = {
                { new Digits(3), new Digits(1) },
                { new Digits(7), new Digits(2) },
                { new Digits(5), new Digits(6) }
        };

        Digits largestDigit = findLargestDigit(digits);
        if (largestDigit != null) {
            System.out.println("Наибольший элемент: " + largestDigit);
        } else {
            System.out.println("Массив цифр пуст.");
        }
    }
    public static Digits findLargestDigit(Digits[][] digits) {
        if (digits == null || digits.length == 0) {
            return null; // Если массив пустой, возвращаем null
        }

        Digits largest = digits[0][0]; // Предполагаем, что первый элемент - наибольший

        // Проходим по двумерному массиву и находим наибольший элемент
        for (Digits[] row : digits) {
            for (Digits digit : row) {
                if (digit.compareTo(largest) > 0) {
                    largest = digit; // Обновляем наибольший элемент
                }
            }
        }
        return largest;
    }
}

class Digits implements Comparable<Digits> {
    private int value;

    // Конструктор
    public Digits(int value) {
        this.value = value;
    }

    // Реализация метода compareTo() для сравнения по значению
    @Override
    public int compareTo(Digits other) {
        return Integer.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return value +"";
    }
}


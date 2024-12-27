package org.example;

import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите номер месяца (1-12): ");
            int month = scanner.nextInt();

            if (month < 1 || month > 12) {
                throw new IllegalArgumentException("Недопустимое число");
            }

            System.out.println("Месяц: " + months[month - 1] + ", Дней: " + days[month - 1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
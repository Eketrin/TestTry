package org.example;

import java.util.Scanner;

public class InputMonth {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};

        Scanner scanner = new Scanner(System.in);
        int month = -1;

        while (true) {
            try {
                System.out.print("Введите номер месяца (1-12): ");
                month = Integer.parseInt(scanner.nextLine());
                if (month < 1 || month > 12) {
                    throw new IllegalArgumentException("Недопустимое число");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода! Введите целое число.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Месяц: " + months[month - 1]);
        scanner.close();
    }
}

package org.example;

import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        while (true) {
            try {
                System.out.print("Введите первое число: ");
                num1 = Integer.parseInt(scanner.nextLine());
                System.out.print("Введите второе число: ");
                num2 = Integer.parseInt(scanner.nextLine());
                break; // Завершить цикл, если ввод корректен
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода! Введите целые числа.");
            }
        }

        System.out.println("Сумма: " + (num1 + num2));
    }
}
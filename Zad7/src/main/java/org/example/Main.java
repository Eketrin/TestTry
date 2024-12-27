package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            Fraction fraction1 = new Fraction(3, 4);
            System.out.println("Создана дробь: " + fraction1);

            Fraction fraction2 = new Fraction(5, 0); // Это вызовет исключение
            System.out.println("Создана дробь: " + fraction2);
        } catch (ZeroDenominatorException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
/*
* ZeroDenominatorException: Это класс проверяемого исключения, который наследуется от Exception.
* Он принимает сообщение, которое будет передано при возникновении исключения.

Fraction: Этот класс представляет дробь с двумя полями: numerator (числитель)
* и denominator (знаменатель). Конструктор класса принимает два целых числа и
* выбрасывает ZeroDenominatorException, если знаменатель равен нулю.

Main: Тестовый класс, который создает экземпляр Fraction с правильными значениями,
* а затем пытается создать дробь с нулевым знаменателем, что вызывает исключение.
* Исключение обрабатывается, и выводится сообщение об ошибке.
* */
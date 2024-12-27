package org.example;

public class Main {

    public static void main(String[] args) {
        // Пример использования
        Circle[] circles = {
                new Circle(3.0),
                new Circle(1.5),
                new Circle(2.7),
                new Circle(4.1),
                new Circle(2.9)
        };

        Circle largestCircle = findLargestCircle(circles);
        if (largestCircle != null) {
            System.out.println("Наибольший круг: " + largestCircle);
        } else {
            System.out.println("Массив кругов пуст.");
        }
    }

    public static Circle findLargestCircle(Circle[] circles) {
        if (circles == null || circles.length == 0) {
            return null; // Если массив пустой, возвращаем null
        }
        Circle largest = circles[0]; // Предполагаем, что первый элемент - наибольший
        // Проходим по массиву и находим наибольший элемент
        for (Circle circle : circles) {
            if (circle.compareTo(largest) > 0) { //circle - один из элементов списка, сравнивается с largest
                largest = circle; //если 1, то меняем
            }
        }
        return largest;
    }
}
class Circle implements Comparable<Circle> {
    private double radius;

    // Конструктор
    public Circle(double radius) {
        this.radius = radius;
    }

    // Реализация метода compareTo() для сравнения по радиусу
    @Override
    public int compareTo(Circle other) { //возвращает -1, 0, 1
        return Double.compare(this.radius, other.radius);
        // 1>2 = 1
        // 1<2 = -1
        // 1=1 = 0
    }

    @Override
    public String toString() {
        return radius+"";
    }
}



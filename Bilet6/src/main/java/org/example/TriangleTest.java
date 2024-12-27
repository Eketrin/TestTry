package org.example;

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

class Triangle {
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Стороны не образуют треугольник.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" + "side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 + '}';
    }
}

public class TriangleTest {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(3, 4, 5);
            System.out.println(triangle);

            Triangle invalidTriangle = new Triangle(1, 2, 3); // Выброс исключения
        } catch (IllegalTriangleException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}

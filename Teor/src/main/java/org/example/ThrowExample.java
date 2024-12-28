package org.example;

public class ThrowExample {
    public void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно.");
        }
        System.out.println("Результат: " + (a / b));
    }

    public static void main(String[] args) {
        ThrowExample example = new ThrowExample();
        example.divide(10, 2);
        example.divide(10, 0); // Исключение ArithmeticException
    }
}


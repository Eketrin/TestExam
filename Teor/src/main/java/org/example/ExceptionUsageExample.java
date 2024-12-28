package org.example;

import java.util.Scanner;

public class ExceptionUsageExample {
    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите числитель: ");
            int numerator = scanner.nextInt();
            System.out.print("Введите знаменатель: ");
            int denominator = scanner.nextInt();
            System.out.println("Результат: " + divide(numerator, denominator));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Сканер закрыт.");
        }
    }
}


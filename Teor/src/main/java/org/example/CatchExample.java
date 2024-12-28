package org.example;

public class CatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Попытка доступа к несуществующему элементу
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Обработано исключение: " + e.getMessage());
        }
        System.out.println("Программа продолжает работу...");
    }
}


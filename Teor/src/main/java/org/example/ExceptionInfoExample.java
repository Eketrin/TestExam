package org.example;

public class ExceptionInfoExample {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length()); // Попытка вызова метода у null
        } catch (NullPointerException e) {
            System.out.println("Тип исключения: " + e.getClass().getName());
            System.out.println("Сообщение: " + e.getMessage());
            System.out.print("Стек вызовов: ");
            e.printStackTrace();
        }
    }
}


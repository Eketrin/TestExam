package org.example;

import java.io.IOException;

public class ExceptionExample {
    // Метод объявляет, что может выбросить IOException
    public void readFile(String filePath) throws IOException {
        if (filePath == "Экз.txt") {
            throw new IOException("Путь к файлу не может быть пустым.");
        }
        // Логика чтения файла
        System.out.println("Файл успешно прочитан.");
    }

    public static void main(String[] args) {
        ExceptionExample example = new ExceptionExample();
        try {
            example.readFile(null);
        } catch (IOException e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }
    }
}


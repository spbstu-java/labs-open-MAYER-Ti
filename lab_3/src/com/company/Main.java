package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Введите путь к файлу словаря: ");
        String filePath = "dictionary.txt"; //scanner.nextLine();
        System.out.println("Рабочая директория: " + System.getProperty("user.dir"));
        DictionaryLoader loader = new DictionaryLoader();

        try {
            loader.load(filePath);

            Translator translator = new Translator(loader.getDictionary());

            System.out.println("Словарь загружен. Введите текст для перевода:");
            String input = scanner.nextLine();

            String output = translator.translate(input);
            System.out.println("Перевод:");
            System.out.println(output);

        } catch (InvalidFileFormatException e) {
            System.err.println("Ошибка формата словаря: " + e.getMessage());
        } catch (FileReadException e) {
            System.err.println("Ошибка чтения словаря: " + e.getMessage());
        }
    }
}

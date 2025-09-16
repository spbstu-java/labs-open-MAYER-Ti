package lab_4;

import java.util.*;
import java.util.stream.*;

public class Main {

    // 1. Среднее значение списка целых чисел
    public static double average(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElseThrow(() -> new NoSuchElementException("Список пуст"));
    }

    // 2. Все строки в верхний регистр + префикс "_new_"
    public static List<String> toUpperWithPrefix(List<String> strings) {
        return strings.stream()
                .map(s -> "_new_" + s.toUpperCase())
                .collect(Collectors.toList());
    }

    // 3. Квадраты элементов, встречающихся только 1 раз
    public static List<Integer> uniqueSquares(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> Collections.frequency(numbers, n) == 1)
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    // 4. Последний элемент коллекции
    public static <T> T lastElement(Collection<T> collection) {
        return collection.stream()
                .reduce((first, second) -> second)
                .orElseThrow(() -> new NoSuchElementException("Коллекция пуста"));
    }

    // 5. Сумма чётных чисел в массиве
    public static int sumEven(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .sum();
    }

    // 6. Преобразовать строки в Map: первый символ -> остальная строка
    public static Map<Character, String> toMap(List<String> strings) {
        return strings.stream()
                .collect(Collectors.toMap(
                        s -> s.charAt(0),
                        s -> s.substring(1),
                        (existing, replacement) -> existing // если ключ повторяется
                ));
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 4, 5, 5);
        List<String> strs = Arrays.asList("apple", "banana", "cherry");

        System.out.println("Среднее: " + average(nums));
        System.out.println("Upper + prefix: " + toUpperWithPrefix(strs));
        System.out.println("Уникальные квадраты: " + uniqueSquares(nums));
        System.out.println("Последний элемент: " + lastElement(strs));
        System.out.println("Сумма чётных: " + sumEven(new int[]{1,2,3,4,5,6}));
        System.out.println("Map: " + toMap(strs));
    }
}

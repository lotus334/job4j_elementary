package ru.job4j.array;

public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        for (int i = numbers.length % 2 == 0 ? 1 : 0; i < numbers.length; i += 2) {
            System.out.println(numbers[numbers.length - 1 - i]);
        }
    }
}

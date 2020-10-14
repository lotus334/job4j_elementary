package ru.job4j.array;

public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int index;
        for (int i = 0; i < numbers.length; i++) {
            index = numbers.length - 1 - i;
            if (index % 2 == 0) {
                System.out.println(numbers[index]);
            }
        }
    }
}

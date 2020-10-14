package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int right = array.length - 1;
        for (int left = 0; left < array.length / 2; left++) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            right--;
        }
        return array;
    }
}
// {4, 1, 6, 2}
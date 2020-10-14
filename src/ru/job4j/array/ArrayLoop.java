package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arrayOfInts = new int[5];
        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = i * 2 + 3;
        }
        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.println(arrayOfInts[i]);
        }
    }
}

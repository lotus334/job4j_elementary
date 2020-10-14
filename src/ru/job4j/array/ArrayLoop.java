package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arrayOfInts = new int[5];
        for (int i = 0; i < arrayOfInts.length; i++) {
            arrayOfInts[i] = i;
        }
        for (int i = 0; i < arrayOfInts.length; i += 2) {
            System.out.println(arrayOfInts[i]);
        }
    }
}

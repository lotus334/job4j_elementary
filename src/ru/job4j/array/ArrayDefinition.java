package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "John";
        names[1] = "Arkadiy";
        names[2] = "Suyzana";
        names[3] = "Akakiy";
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
    }
}

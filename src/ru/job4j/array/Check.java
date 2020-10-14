package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean test = data[0];
        for (boolean item : data) {
            if (test != item) {
                result = false;
                break;
            }
        }
        return result;
    }
}

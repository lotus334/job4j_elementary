package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int[] row : array) {
            for (int j = 0; j < row.length; j++) {
                if (row[j] < 0) {
                    row[j] = 0;
                }
            }
        }
        return array;
    }
}

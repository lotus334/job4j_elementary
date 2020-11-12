package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        double sum = 0;
        for (int i = 1; i <= count; i++) {
            double elem = first * Math.pow(denominator, i - 1);
            sum += elem;
        }
        return (int) sum;
    }
}
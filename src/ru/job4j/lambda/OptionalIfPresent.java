package ru.job4j.lambda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalIfPresent {

    public static void ifPresent(int[] data) {
        max(data).ifPresent(num -> System.out.println("Max: " + num));
    }

    private static Optional<Integer> max(int[] data) {
        Optional<Integer> max = Optional.empty();
        if (data.length > 0) {
            max = Optional.of(data[0]);
            for (int el : data) {
                if (el > max.get()) {
                    max = Optional.of(el);
                }
            }
        }
        return max;
    }
}

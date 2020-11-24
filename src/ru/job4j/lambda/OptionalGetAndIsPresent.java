package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalGetAndIsPresent {

    public static int get(int[] data, int el) {
        int result = -1;
        if (indexOf(data, el).isPresent()) {
            result = indexOf(data, el).get();
        }
        return result;
    }

    private static Optional<Integer> indexOf(int[] data, int el) {
        Optional<Integer> opt = Optional.empty();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                opt = Optional.of(i);
            }
        }
        return opt;
    }
}
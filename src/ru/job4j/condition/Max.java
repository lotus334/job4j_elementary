package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean leftBigger = left > right;
        int answer = leftBigger ? left : right;
        return answer;
    }

    public static int max(int left, int center, int right) {
        return max(left,
                max(center, right));
    }

    public static int max(int left, int center, int right, int last) {
        return max(left,
                max(center,
                        max(right, last)));
    }
}
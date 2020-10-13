package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean leftBigger = left > right;
        int answer = leftBigger ? left : right;
        return answer;
    }
}
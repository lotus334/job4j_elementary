package ru.job4j.array;

public class Merge {
    public static int[] merge2(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;
        int min = Integer.MAX_VALUE;
        while (resultIndex < left.length + right.length) {
            boolean leftB = false;
            for (int i = rightIndex; i < right.length; i++) {
                if (right[rightIndex] < min) {
                    min = right[rightIndex];
                    break;
                } else if (right[rightIndex] > min) {
                    break;
                }
            }
            for (int i = leftIndex; i < left.length; i++) {
                if (left[leftIndex] == min) {
                    leftIndex++;
                    result[resultIndex++] = min;
                    break;
                } else if (left[leftIndex] < min) {
                    min = left[leftIndex];
                    leftB = true;
                    break;
                } else if (left[leftIndex] > min) {
                    break;
                }
            }
            result[resultIndex++] = min;
            min = Integer.MAX_VALUE;
            if (leftB) {
                leftIndex++;
            } else {
                rightIndex++;
            }
        }
        return result;
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;
        int min;
        boolean leftLess = false;
        while (resultIndex < left.length + right.length) {
            min = Integer.MAX_VALUE;
            if (rightIndex < right.length) {
                min = Math.min(right[rightIndex], min);
                leftLess = false;
            }
            if (leftIndex < left.length) {
                if (left[leftIndex] == min) {
                    leftIndex++;
                    result[resultIndex++] = min;
                } else if (left[leftIndex] < min) {
                    min = left[leftIndex];
                    leftLess = true;
                }
            }
            result[resultIndex++] = min;
            if (leftLess) {
                leftIndex++;
            } else {
                rightIndex++;
            }
        }
        return result;
    }
}
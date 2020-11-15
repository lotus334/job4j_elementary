package ru.job4j.collection;

public class Parentheses {
    public static boolean valid(char[] data) {
        boolean isValid = true;
        int opened = 0;
        int closed = 0;
        for (char ch : data) {
            if (ch == '(') {
                opened++;
            } else if (ch == ')') {
                closed++;
            }
            if (closed > opened) {
                isValid = false;
                break;
            }
        }
        if (!(opened == closed)) {
            isValid = false;
        }
        return isValid;
    }
}

package ru.job4j.condition;

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(4);
        possibleDiv(0);
        possibleDiv(-4);
    }

    public static void possibleDiv(int number) {
        boolean condition1 = number == 0;
        boolean condition2 = number < 0;
        if (condition1) {
            System.out.println("Could not div by 0.");
        } else if (condition2) {
            System.out.println("This is negative numbers");
        }
    }
}

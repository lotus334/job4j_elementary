package ru.job4j.oop;

public class DemoBoxes {
    public static void main(String[] args) {
        BoxWeight weightBox = new BoxWeight(1, 2, 3, 4);
        BoxWeight weightBox2 = new BoxWeight(weightBox);
        System.out.println(weightBox2.volume());
        Box box;
        box = weightBox;
    }
}

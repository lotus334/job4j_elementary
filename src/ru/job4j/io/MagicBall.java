package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        new Scanner(System.in).nextLine();
        int answer = new Random().nextInt(3);
        System.out.println(answer == 0 ? "Да" : (answer == 1 ? "Нет" : "Может быть"));
    }
}

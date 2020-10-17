package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matches = 11;
        int counter = 0;
        int choose;
        while (matches > 0) {
            System.out.printf("Осталось %d спичек\n", matches);
            if (counter % 2 == 0) {
                System.out.println("Ход первого игрока");
            } else {
                System.out.println("Ход второго игрока");
            }
            counter++;
            choose = scanner.nextInt();
            while (choose < 1 || choose > 3) {
                System.out.println("Пожалуйста, введите число от 1 до 3");
                choose = scanner.nextInt();
            }
            matches -= choose;
        }
        System.out.printf("Игра завершена! Победил %s игрок", counter % 2 == 0 ? "второй" : "первый");
    }
}

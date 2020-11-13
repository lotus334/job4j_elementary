package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        Set<String> wordsOfArticle = new HashSet<>(Set.of(s.split(" ")));
        boolean correct = true;
        for (String word : words) {
            if (wordsOfArticle.contains(word)) {
                correct = false;
            }
        }
        return correct ? "Вы сделали правильный выбор!" : "Выберите другую статью...";
    }
}
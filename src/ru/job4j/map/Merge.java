package ru.job4j.map;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Merge {
    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
        users.forEach(new Consumer<User>() {
            @Override
            public void accept(User user) {
                names.putIfAbsent(user.getId(), user.getName());
                names.merge(user.getId(), user.getSurname(), new BiFunction<String, String, String>() {
                    @Override
                    public String apply(String s, String s2) {
                        return s + " " + s2;
                    }
                });
            }
        });
        return names;
    }

    public static class User {
        private int id;
        private String name;
        private String surname;

        public User(int id, String name, String surname) {
            this.id = id;
            this.name = name;
            this.surname = surname;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return id == user.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}
package ru.job4j.map;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class ComputeIfAbsent {
    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
//        for (User user : users) {
//            ComputeIfPresent computeIfPresent = new ComputeIfPresent();
//            names.computeIfPresent(user.getId(), new BiFunction<Integer, String, String>() {
//                @Override
//                public String apply(Integer integer, String s) {
//                    return user.getName();
//                }
//            });
//            names.computeIfAbsent(user.getId(), new Function<Integer, String>() {
//                @Override
//                public String apply(Integer integer) {
//                    return user.getName();
//                }
//            });
//        }

//        users.forEach(new Consumer<User>() {
//            @Override
//            public void accept(User user) {
//                ComputeIfPresent computeIfPresent = new ComputeIfPresent();
//                names.computeIfPresent(user.getId(), new BiFunction<Integer, String, String>() {
//                    @Override
//                    public String apply(Integer integer, String s) {
//                        return user.getName();
//                    }
//                });
//                names.computeIfAbsent(user.getId(), new Function<Integer, String>() {
//                    @Override
//                    public String apply(Integer integer) {
//                        return user.getName();
//                    }
//                });
//            }
//        });

        users.forEach(user -> names.computeIfPresent(user.getId(), (key, val) -> user.getName()));

        users.forEach(user -> names.computeIfAbsent(user.getId(), key -> user.getName()));

        return names;
    }

    public static class User {
        private int id;
        private String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ComputeIfAbsent.User user = (ComputeIfAbsent.User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
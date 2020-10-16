package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int firstNullIndex = -1;
        for (int i = 0; i < products.length; i++) {
            Product pr = products[i];
            if (pr == null) {
                firstNullIndex = i;
                break;
            }
        }
        return firstNullIndex;
    }
}

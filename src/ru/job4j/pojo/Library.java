package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 3532);
        Book buildingRegulations = new Book("Building Regulations 63.13330.2018", 263);
        Book iWillBeAProgrammer = new Book("I will be a Programmer!", 15);
        Book startWorkingAsAJavaDeveloper = new Book("Start working as a Java Developer. Just do it!", 8);
        Book[] library = {cleanCode, buildingRegulations, iWillBeAProgrammer, startWorkingAsAJavaDeveloper};
        for (int i = 0; i < library.length; i++) {
            Book bk = library[i];
            System.out.println(bk.getName() + " - " + bk.getPages() + " pages");
        };
        System.out.println(System.lineSeparator() + "Swapping books with index zero and three:" + System.lineSeparator());
        Book temp = library[0];
        library[0] = library[3];
        library[3] = temp;
        for (int i = 0; i < library.length; i++) {
            Book bk = library[i];
            System.out.println(bk.getName() + " - " + bk.getPages() + " pages");
        };
        System.out.println(System.lineSeparator() + "Lets output the best book: ");
        for (int i = 0; i < library.length; i++) {
            Book bk = library[i];
            if ("clean code".toLowerCase().equals(bk.getName().toLowerCase())) {
                System.out.println(bk.getName() + " - " + bk.getPages() + " pages");
            }
        };
    }
}

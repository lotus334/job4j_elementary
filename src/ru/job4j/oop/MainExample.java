package ru.job4j.oop;

public class MainExample {
    public static void main(String[] args) {
        PetExample pet = new PetExample();
        CatExample cat = new CatExample();
        DogExample dog = new DogExample();
        pet.sound();
        cat.sound();
        dog.sound();
    }
}

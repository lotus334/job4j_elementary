package ru.job4j.oop;

public class Main {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle[] vehicles = new Vehicle[]{plane, train, bus};
        for (Vehicle veh : vehicles) {
            veh.move();
        }
    }
}
package ru.job4j;

public class Cat extends Animal{
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }

    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        Cat.testClassMethod();
        myAnimal.testInstanceMethod();
        myCat.testInstanceMethod();
        System.out.println();
        System.out.println(myAnimal.getClass());
    }
}

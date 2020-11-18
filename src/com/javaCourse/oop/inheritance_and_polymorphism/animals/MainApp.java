package com.javaCourse.oop.inheritance_and_polymorphism.animals;

public class MainApp {
    public static void main(String[] args) {
        Animal animal = new Cat("Kuzya", "White", 1);
        animal.voice();
        animal.jump();
        //Dog dog = new Dog("Tuzya", "Brown", 1);
        if (animal instanceof Cat) {
            ((Cat) animal).catsMethod();
        }
    }
}

package com.javaCourse.oop.practice2;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Kuzya", "Black", 4000);
        Plate plate = new Plate(1000);
        plate.fill();
        for (int i = 0; i < 7; i++) {
            cat.eat(plate);

        }

        cat.printInfo();
        plate.printInfo();

    }
}

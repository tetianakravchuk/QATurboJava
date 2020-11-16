package com.javaCourse.oop.practice1;

public class oopPracticeCat {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Kuza", "Black", 2, 8);
        cat1.printInfo();
        cat1.eat(600);
        cat1.eat(500);
        cat1.eat(100);
        cat1.printInfo();
        cat1.sleep();
        cat1.printInfo();
    }
}

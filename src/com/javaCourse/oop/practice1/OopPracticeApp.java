package com.javaCourse.oop.practice1;

public class OopPracticeApp {
    public static void main(String[] args) {
        Box box1 = new Box("Green", 10, 20, 20);
        Box box2 = new Box("Red", 10, 50, 50);
        box1.printInfo();
        box2.printInfo();
        box1.close();
        box1.open();
        box1.open();
    }
}

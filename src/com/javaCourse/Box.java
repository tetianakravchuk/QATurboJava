package com.javaCourse;

public class Box {
    String color;
    int size;
    boolean isOpened;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
        this.isOpened = false;

    }

    public void open() {
        if (isOpened) {
            System.out.println("Box is already closed");
            return;
        }
        isOpened = true;
        System.out.println("You have opened the box");
    }

    public void close() {
        if (!isOpened) {
            System.out.println("Box is closed");
            return;
        }
    }

    public void info() {
        System.out.print("Box: " + color + "" + " - ");
        if (isOpened) {
            System.out.println("Opened");
        } else {
            System.out.println("Closed");

        }
    }
}

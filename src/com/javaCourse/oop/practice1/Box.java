package com.javaCourse.oop.practice1;

public class Box {
    private String color;
    private float weight;
    private boolean isOpened; // boolean by default = false
    private int width, height, length; // cm

    public Box(String color, int width, int height, int length) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.length = length;
        this.weight = width * height * length * 0.1f;
        this.isOpened = false;
    }

    public void open() {
        if (!isOpened) {
            isOpened = true;
            System.out.println("Box is opened");
        } else {
            System.out.println("Box was already opened");
        }
    }

    public void close() {
        if (!isOpened) {
            isOpened = false;
            System.out.println("Box is closed");
        } else {
            System.out.println("Box was already closed");
        }
    }

    public void printInfo() {
        System.out.printf("Box [ size: %dx%dx%d, color %s, Weight: %f kg. ]\n"
                , width, length, height, color, weight);
        if (isOpened) {
            System.out.println("Box is opened");
        } else {
            System.out.println("Box is closed");
        }
    }
}

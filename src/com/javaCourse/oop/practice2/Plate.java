package com.javaCourse.oop.practice2;

public class Plate {
    private int capacity;
    private int food;

    public Plate(int capacity) {
        this.capacity = capacity;

    }

    public int decreaseFood(int amount) {
        if (food == 0) {
            System.out.println("Plate is empty");
            return 0;
        }
        if (food >= amount) { // if food 200 rm: 100
            food -= amount;// food 100
            return amount; // Cat got 100 rm
        }
        amount = food; // food 50, amount needed 100 => cat can eat max 50
        food = 0; // food 0
        return amount; //50

    }

    public void fill() {
        System.out.println("Plate is getting full with food");
        food = capacity;
    }

    public void printInfo() {
        System.out.println("Plate: " + food + " / " + capacity);
    }
}

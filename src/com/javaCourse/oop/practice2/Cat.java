package com.javaCourse.oop.practice2;

public class Cat {
    private String name;
    private String color;
    private int appetite;
    private int weight;


    public Cat(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.appetite = 500;
        this.weight = weight;
    }

    public void eat(Plate p) {
        int amount = 100;
        if (appetite < amount) {
            amount = appetite;
        }
        if (amount == 0) {
            System.out.println(name + " cat is not hungry");
            return;
        }
        int result = p.decreaseFood(100);
        if (result == 0) {
            System.out.println("Plate is empty, cat has no food");
            return;
        }
        System.out.println(name + " eat " + result + " gr. food");
        appetite -= 100;
        weight += (result * 0.05f);


    }

    public void printInfo() {
        System.out.println("Name: " + name + " "
                + color + " " + weight + " " + appetite);
    }
}

package com.javaCourse.oop.practice1;

public class Cat {
    private String name;
    private String color;
    private int age;
    private float weight;
    private int appetite;

    public Cat(String name, String color, int age, float weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
        this.appetite = 1000;
    }

    public void printInfo() {
        System.out.printf("Cat [ name: %s, color: %s, age: %d, weight: %f]\n"
                , name, color, age, weight);

    }

    public void eat(int amount) {
        if (appetite < 0) {
            System.out.println(name + " Cat if full");
            return;
        }
        System.out.printf("%s eat %d gr. food\n", name, amount);
        appetite -= amount;
        weight += amount / 1000.0f * 0.1f;
    }

    public void sleep() {
        System.out.println(name + " fall asleep");
        weight -= weight * 0.001f;
    }

}

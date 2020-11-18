package com.javaCourse.oop.inheritance_and_polymorphism.animals;

public class Cat extends Animal {


    public Cat(String name, String color, int age) {
        super(name, color, age);

    }

    @Override
    public void voice() {
        System.out.println(name + ": myau");
    }

    @Override
    public void jump() {
        super.jump();
        if (Math.random() < 0.5) {
            System.out.println(name + ": cat jumped but failed");
        }

    }

    public void catsMethod() {
        System.out.println("Cat method");
    }
}

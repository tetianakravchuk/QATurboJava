package com.javaCourse;

public class Main {


    public static void main(String[] args) {
        User user1 = new User(1L, "Bob", "bob@gmail.com");
        user1.printInfo();
        user1.jump();

        User user2 = new User(2L, "John", "joghn@gmail.com");
        user2.printInfo();
        user2.jump();
        Document document = new Document("Doc #1", "Java");

        Box box = new Box("Green", 12);
        box.open();
        box.info();
        box.close();
        box.info();
        box.close();


        document.print();
        document.sign(user1.name);
        document.print();
        document.sign(user2.name);
        document.print();


    }
}


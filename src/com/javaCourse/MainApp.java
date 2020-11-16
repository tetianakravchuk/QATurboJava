package com.javaCourse;

public class MainApp {
    public static void main(String[] args) {
        DocumentTwo documentTwo = new DocumentTwo("Doc #1", "Java Core");
        documentTwo.info();
        documentTwo.sign("Bob");
        documentTwo.info();
        documentTwo.sign("John");
        //documentTwo.signature = "Victor";
        documentTwo.info();
        System.out.println(documentTwo.getSignature());
        documentTwo.setPriority(-10);
        System.out.println(documentTwo.getPriority());
    }
}
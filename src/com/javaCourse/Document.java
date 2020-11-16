package com.javaCourse;

public class Document {
    String title;
    String content;
    String signature;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;

    }

    public void print() {
        System.out.println("Document: " + title);
        System.out.println((content));
        System.out.println("Sign:" + signature);
    }

    public boolean isSigned() {

        return signature != null;
    }

    public boolean sign(String username) {
        if (isSigned()) {
            return false;
        }
        signature = username;
        return true;
    }

}

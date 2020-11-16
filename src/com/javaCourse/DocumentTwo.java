package com.javaCourse;

public class DocumentTwo {
    private String title;
    private String content;
    private String signature; //null
    private int priority;

    public DocumentTwo(String title, String content) {
        this.title = title;
        this.content = content;
        this.priority = 5;

    }

    public String getSignature() {
        return signature;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        if (priority >= 1 && priority <= 10) {
            this.priority = priority;

        }
    }

    public void sign(String username) {
        if (signature == null) {
            signature = username;
            System.out.println("Document " + title
                    + " already was signed by  " + username);
        } else {
            System.out.println("Document " + title + " is signed");
        }

    }

    public void info() {
        System.out.println("Title: " + title);
        System.out.println(content);
        System.out.println("Singnature: " + signature);
    }
}

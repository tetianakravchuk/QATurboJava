package com.javaCourse.oop.strings;

public class HomeWorkString {
    public static void main(String[] args) {

        System.out.println(countOccurrences("Learn JaVA now", 'h'));
        compareLetters("boston");
        stringSub("Boston");

    }


    //1. Напишите метод, которому в качестве аргумента передается строка и символ,
    // метод должен вернуть число равное тому, сколько раз символ встречается в слове;
    public static int countOccurrences(String s, char n) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == n) {
                count++;
            }
        }
        return count;
    }

    //2. Напишите метод, который проверяет что строка заканчивается на тот же символ,
// на который начинается (пусть строка будет в нижнем регистре);
    public static void compareLetters(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                System.out.println("The word " + s + " begins and ends with the character " + s.charAt(0));
            } else {
                System.out.println("The word " + s + " begins with " + s.charAt(0) + " and ends with "
                        + s.charAt(s.length() - 1) + " these characters are not the same.");
            }
        }
    }

    //3. Напишите метод, возвращающий левую половину строки,
    // переданной в качестве аргумента;
    public static void stringSub(String s) {
        System.out.println("First 3 char of the word is " + s.substring(s.length() - 3));

    }

}

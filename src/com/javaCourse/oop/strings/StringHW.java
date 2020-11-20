package com.javaCourse.oop.strings;

public class StringHW {
    public static void main(String[] args) {
        System.out.println(evenIndex("Boston"));
        System.out.println(buildNewString('D', 6));
    }

    //1. Напишите метод, который принимает в качестве аргумента строку,
    // и возвращает строку, состоящую из символов входной строки,
    // находящихся на четных позициях;
    public static String evenIndex(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }

    //2. Реализуйте метод,
// принимающий на вход символ и число N,
// метод должен вернуть строку, состоящую из указанного символа, длиной N;
    public static String buildNewString(char what, int howMany) {
        StringBuilder out = new StringBuilder(howMany);
        for (int i = 0; i < howMany; i++)
            out.append(what);
        return out.toString();

    }


}






package com.javaCourse.oop.strings;

import java.util.Arrays;

public class DemoStringApp {
    public static void main(String[] args) {
        String str1 = "JavaLearnNOW";
        String str2 = "Core";
        System.out.println(str1.length());
        System.out.println(str1.charAt(str1.length() - 1));
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i) + "");
        }
        System.out.println(str1.contains("a"));
        System.out.println(str1.charAt(1));
        System.out.println(str1.startsWith("va"));
        System.out.println(str1.endsWith("a"));
        System.out.println(Arrays.toString(str1.getBytes()));
        System.out.println("Java".equals("Java"));
        System.out.println("JAVA".equalsIgnoreCase("Java"));
        System.out.println(str1.indexOf('v'));
        System.out.println("abababababcde".lastIndexOf('b'));
        System.out.println(str2.isEmpty());
        System.out.println("Java".replace('a', 'b'));
        System.out.println("Hello1234".substring(2, 5));
        System.out.println(Arrays.toString("1234 java core demo wrr".split("")));
    }
}

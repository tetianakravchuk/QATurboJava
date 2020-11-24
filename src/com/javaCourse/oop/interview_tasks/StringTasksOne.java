package com.javaCourse.oop.interview_tasks;

import com.sun.org.apache.xpath.internal.operations.String;

public class StringTasksOne {

    public static void main(String[] args) {
        System.out.println(doubleChar("Java Core"));
        System.out.println(isPalindrome1("aabbbaa"));
        System.out.println(isPalindrome2("aabbbaa"));
        System.out.println(isPalindrome3("aabbbaa"));
        System.out.println(isContainsSameSymbols("abcd", "abcde"));
    }

    // Given a string,
    // return a string where for every char in the original, there are two chars
    // We have "Java"
    public static String doubleChar(String input) {
        StringBuilder out = new StringBuilder(input.length() * 2);
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            out.append(c).append(c);
        }
        return out.toString();

    }

    // Is a string palindrome? its a string what is the same backwords
    public static boolean isPalindrome1(String input) {
        // madam
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                return false;
            }

        }
        return true;
    }


    public static boolean isPalindrome2(String input) {
        // madam
        StringBuilder stringBuilder = new StringBuilder(input);
        stringBuilder.reverse();
        if (stringBuilder.toString().equals(input)) ;

        return stringBuilder.toString().equals(input);
    }

    public static boolean isPalindrome3(String input) {
        // madam
        StringBuilder stringBuilder = new StringBuilder(input.length());
        for (int i = input.length() - 1; i >= 0; i--) {
            stringBuilder.append(input.charAt(i));

        }
        return stringBuilder.toString().equals(input);
    }


    // Do two strings contain the same characters (ignore case)
    // str1: abcd str2: bcaf
    public static boolean isContainsSameSymbols(String in1, String in2) {
        in1 = in1.toLowerCase();
        in2 = in2.toLowerCase();

        for (int i = 0; i < in1.length(); i++) {
            char expectedChar = in1.charAt(i);
            boolean result = false;
            for (int j = 0; j < in2.length(); j++) {
                if (in2.charAt(j) == expectedChar) {
                    result = true;
                    break;
                }
            }
            if (!result) {
                return false;
            }
        }
        for (int i = 0; i < in2.length(); i++) {
            char expectedChar = in2.charAt(i);
            boolean result = false;
            for (int j = 0; j < in1.length(); j++) {
                if (in1.charAt(j) == expectedChar) {
                    result = true;
                    break;
                }
            }
            if (!result) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOnlyDigits(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }

        }
        return true;

    }

    // Reverse each word in a String

    public static String reverseWordIntoString(String str) {
        // 'Java Core hello'
        String[] words = str.split("");
        StringBuilder stringBuilder = new StringBuilder(str.length());
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                stringBuilder.append(words[i].charAt(j));

            }
            stringBuilder.append(" ");
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    // Convert first letter of each wrd from lower case to upper case

    public static String eachWordsFirstSymbolToUpperCase(String str) {
        // 'Java Core hello'
        String[] words = str.split("");
        StringBuilder stringBuilder = new StringBuilder(str.length());
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j--) {
                char c = words[i].charAt(j);
                if (j == 0) {
                    c = Character.toUpperCase(c);
                }
                stringBuilder.append(words[i].charAt(j));

            }
            stringBuilder.append(" ");
        }
        stringBuilder.setLength(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    // How to remove all whiteSpaces

    public static String removeAllSpaces(String in) {
        StringBuilder stringBuilder = new StringBuilder(in.length());
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i)) !=' ' {
                stringBuilder.append(in.charAt(i));
            }

        }
        return stringBuilder.toString();

    }
}











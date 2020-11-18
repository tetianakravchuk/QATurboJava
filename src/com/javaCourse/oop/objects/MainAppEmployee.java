package com.javaCourse.oop.objects;

public class MainAppEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1234, "Josh", "Seaton", 991328238, "eee@gmail.com");
        Employee employee2 = new Employee(1234, "Josh", "Winsdor", 5678, "josh.w@gmal.com");
        System.out.println(employee1);
        System.out.println(employee2);
    }
}
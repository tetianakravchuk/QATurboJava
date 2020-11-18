package com.javaCourse.oop.objects;

import java.util.Objects;

public class Employee {
//    Создайте класс сотрудник с полями: id, имя,
//    фамилия, номер телефона, e-mail.
//    Реализуйте методы equals() и hashCode(),
//    которые сравнивают объекты и вычисляют хэш-код на основе полей: id, имя, фамилия.

    int id;
    String name;
    String familyName;
    int cellNumber;
    String email;

    public Employee(int id, String name, String familyName, int cellNumber, String email) {
        this.id = id;
        this.name = name;
        this.familyName = familyName;
        this.cellNumber = cellNumber;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                name.equals(employee.name) &&
                familyName.equals(employee.familyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, familyName);
    }
}

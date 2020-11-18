package com.javaCourse.oop.objects;

import java.util.Objects;

public class Box {
    private String color;
    private int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("Box color= %s size = %d", color, size);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Box))
            return false;
        Box box = (Box) obj;
        return size == box.size
                &&
                Objects.equals(color, box.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, size);
    }
}

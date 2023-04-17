package org.HW1.polymorphism;

public class Square implements Figure{
    @Override
    public void draw(int r) {

    }

    @Override
    public void perimeter(int r) {
        System.out.println(4 * r);
    }

    @Override
    public void square(int r) {
        System.out.println(r * r);
    }
}

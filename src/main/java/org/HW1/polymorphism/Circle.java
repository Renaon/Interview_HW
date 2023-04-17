package org.HW1.polymorphism;

public class Circle implements Figure{
    @Override
    public void draw(int r) {
        System.out.println("Кружочек");
    }

    @Override
    public void perimeter(int r) {
        double c = 2 * Math.PI * r;
        System.out.println("Периметр " + c);
    }

    @Override
    public void square(int r) {
        double s = Math.PI * Math.pow(r, 2);
        System.out.println("Площадь круга " + s);
    }
}

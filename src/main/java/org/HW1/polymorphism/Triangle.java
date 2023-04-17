package org.HW1.polymorphism;

public class Triangle implements Figure{
    @Override
    public void draw(int r) {
        System.out.println("Треугольничек");
    }

    @Override
    public void perimeter(int r) {
        System.out.println("Периметр " + r*3);
    }

    @Override
    public void square(int r) {
        double h = r * Math.sqrt(3) / 2;
        double s = r * h/2;
        System.out.println("Площадь " + s);
    }
}

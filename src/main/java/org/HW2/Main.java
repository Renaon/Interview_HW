package org.HW2;

public class Main {
    public static void main(String[] args) {
        SuperList<Integer> someList = new SuperList<Integer>();
        someList.push(0);
        someList.add(123);
        someList.add(45);
        someList.print();
        someList.delete(45);
        someList.print();
    }
}

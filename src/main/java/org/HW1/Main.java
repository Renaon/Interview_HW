package org.HW1;

public class Main {
    public static void main(String[] args) {
        Person person = new BioLab(new CoolCloneBuilder()).releaseClone(
                "Reks", "Lobachevsky", "Eduardo",
                "Tatuin", "WP136", "211-306",
                24, "male"
        );
        System.out.println(person.toString());
    }
}

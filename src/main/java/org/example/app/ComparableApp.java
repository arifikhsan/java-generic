package org.example.app;

import org.example.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Eko", "Jakarta"),
                new Person("Dwi", "Bandung"),
                new Person("Tri", "Jakarta"),
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}

package org.example.app;

import org.example.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Eko", "Jakarta"),
                new Person("Dwi", "Bandung"),
                new Person("Tri", "Jakarta"),
        };

        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}

package org.example.app;

import org.example.Pair;

public class PairApp {
    public static void main(String[] args) {
        var pair = new Pair<>("Hello world!", 42);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}

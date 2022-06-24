package org.example.app;

import org.example.helper.ArrayHelper;

@SuppressWarnings("ALL")
public class FunctionGenericApp {
    public static void main(String[] args) {
        String[] names = {"John", "Jane", "Mary"};
        Integer[] ages = {20, 21, 22};

        System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.count(ages));
    }
}

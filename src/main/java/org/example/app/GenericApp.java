package org.example.app;

import org.example.MyData;

public class GenericApp {
    public static void main(String[] args) {
        MyData<String> myData = new MyData<>("Hello world!");
        MyData<Integer> myData2 = new MyData<>(42);

        String stringValue = myData.getData();
        Integer integerValue = myData2.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
    }
}

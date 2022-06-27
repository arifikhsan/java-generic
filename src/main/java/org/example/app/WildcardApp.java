package org.example.app;

import org.example.MyData;

@SuppressWarnings("Convert2Diamond")
public class WildcardApp {
    public static void main(String[] args) {
        printData(new MyData<Integer>(100));
        printData(new MyData<String>("Hello"));
        printData(new MyData<Double>(3.14));
    }
    public static void printData(MyData<?> data) {
        System.out.println(data.getData());
    }
}

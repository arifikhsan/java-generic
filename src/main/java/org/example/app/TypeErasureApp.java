package org.example.app;

import org.example.MyData;

@SuppressWarnings({"rawtypes", "unchecked", "unused", "Convert2Diamond"})
public class TypeErasureApp {
    public static void main(String[] args) {
        // MyData<String> myData = new MyData<String>("Hello");
        MyData myData = new MyData<String>("Hello"); // bikin error runtime

        MyData<Integer> integerMyData = (MyData<Integer>) myData;
    }
}

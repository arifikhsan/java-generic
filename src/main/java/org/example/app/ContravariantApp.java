package org.example.app;

import org.example.MyData;

@SuppressWarnings("ALL")
public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> myObjectData = new MyData<>("Arif");
        MyData<? super String> myStringData = myObjectData;

        process(myObjectData);
        System.out.println(myStringData.getData());
    }

    public static void process(MyData<? super String> myData) {
        myData.setData("Ikhsan");

        // String value = (String) myData.getData(); // datanya tidak selalu string
        Object value = myData.getData();
        System.out.println("Process Parameter: " + value);
    }
}

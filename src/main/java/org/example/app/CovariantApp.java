package org.example.app;

import org.example.MyData;

@SuppressWarnings("ALL")
public class CovariantApp {
    public static void main(String[] args) {
        var stringData = new MyData<>("Arif");
        process(stringData);

        MyData<? extends Object> myData = stringData;
    }

    public static void process(MyData<? extends Object> myData) {
        Object data = myData.getData();
        // myData.setData(1); // tidak boleh karena tipe datanya ganti
        System.out.println(data);
    }
}

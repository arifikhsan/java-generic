package org.example;

public class MyData<GenericType> {
    private GenericType data;

    public MyData(GenericType data) {
        this.data = data;
    }

    public GenericType getData() {
        return data;
    }

    public void setData(GenericType data) {
        this.data = data;
    }
}

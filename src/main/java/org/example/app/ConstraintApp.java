package org.example.app;

public class ConstraintApp {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberData = new NumberData<>(1);
        NumberData<Double> doubleNumberData = new NumberData<>(1.0);
        NumberData<Long> longNumberData = new NumberData<>(1L);
        NumberData<Float> floatNumberData = new NumberData<>(1F);

        // NumberData<String> stringNumberData = new NumberData<>("Hello world!"); // tidak bisa
    }

    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}

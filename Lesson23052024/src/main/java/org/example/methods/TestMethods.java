package org.example.methods;
//Создайте метод getSum(int a, int b), который ничего не возвращает,
// и печатает результат суммы двух полученных чисел в консоль.

public class TestMethods {
    public static void main(String[] args) {
        getSum(11, 22);
    }

    public static void getSum(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}

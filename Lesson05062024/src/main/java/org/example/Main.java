package org.example;

public class Main {
    public static void main(String[] args) {
//        InnerClassTest innerClassTest = new InnerClassTest();
//        create static inner object
        InnerClassTest.InnerStaticClass staticClass = new InnerClassTest.InnerStaticClass();
// anonymous class
        new Thread() {
            @Override
            public void run() {
                System.out.println("Thread");
            }
        }.start();
    }
}

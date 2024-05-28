package org.example;

public class Main {
    public static void main(String[] args) {
        int num = 10;
//        System.out.println("Original value: " + num);
//        System.out.println("Convert value: " + (-num));

//        predincrement
//        System.out.println("Increment: " + --num);

//          postincrement
//        for(int i = 0; i < 5; i++) {
//            System.out.println("i = " + i);
//        }

//        for(int i = 0; i < 5; i++) {
//            if (i % 2 == 0) {
//                System.out.println("i = " + i);
//            }
//        }
        int a = 5;
//        int i = a++ + ++a + ++a;
//                5   + 7   + 8
        int i= ++a + ++a + a++;
//                6  + 7 + 7
        System.out.println(i);


    }
}
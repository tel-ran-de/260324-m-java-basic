package org.example;

import java.util.Objects;

public class ForEachExample {
    public static void main(String[] args) {
//        int arr [] = {10, 2, 3, 4, 51};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(i + " - " + arr[i]);
//        }
//
//        System.out.println();
//
//        for(double item: arr) {
//            System.out.print(item + " ");
//        }
//        System.out.println();

        String [] fruits = {"apple", "lemon", "orange", "kiwi"};
//        for (int i = 0; i < fruits.length; i++) {
////            System.out.println(fruits[i]);
//            if (Objects.equals(fruits[i], "kiwi")) {
//                System.out.println("True");
//            } else {
//                System.out.println("False");
//            }
//        }

        for(String fruit: fruits) {
            if (Objects.equals(fruit, "kiwi")) {
                System.out.println("We have a kiwi");
            } else {
                System.out.println("We don't have kiwi");
            }
        }
    }
}

package org.example;

public class IfConstruction {
    public static void main(String[] args) {
        int num = 10;

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

//        for (int i = 1; i <= num; i++) {
//            if (i % 2 == 0) {
//                System.out.println("First even number: " + i);
//                break;
//            }
//            System.out.println("Out of if");
//        }
    }

    public static int getNum() {
        return 10;
    }
}

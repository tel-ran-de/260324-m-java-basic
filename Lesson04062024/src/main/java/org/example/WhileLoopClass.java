package org.example;

import java.util.Scanner;

public class WhileLoopClass {
    public static void main(String[] args) {
//        regular loop
//        for (int i = 10; i > 5; i--) {
//            System.out.println(i);
//        }

//        break loop
//        for (int i = 0; i < 1000; i++) {
//            if (i == 10) {
//                break;
//            }
//            System.out.println(i);
//        }

//        return from function loop
//        System.out.println(getNum());

//        for (int i = 0; i < 1000000; i++) {
//            System.out.println(i);
//        }
//        System.out.println(i);

//        int j = 0;
//        while (j < 3 ) {
//            System.out.println(j);
//            j++;
//        }

//        infinity loop
//        while (true) {
//            System.out.println("Hello");
//        }

//        System.out.println("--------------");
//        System.out.println(j);

        Scanner sc = new Scanner(System.in);
//        for (;;) {
        while(true) {
            System.out.println("Enter first number");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            System.out.println("Enter operation");
            char oper = sc.next().charAt(0);
            System.out.println(a + " " + oper + " " + b + " = " + (a + b));
            System.out.println("Do you you want one more time?(Y/N)");
            char answer = sc.next().charAt(0);
            if (answer == 'N' || answer == 'n') {
                break;
            }
        }
    }

//    public static int getNum() {
//        int sum = 0;
//        for(int i = 0; i < 1000; i++) {
//            if (i == 5) {
//                return sum;
//            }
//            sum += i;
//        }
//        return 0;
//    }

//    public static String getName() {
//        for(int i = 0; i < 100000; i++) {
//            if (i == 5) {
//                return "End if";
//            }
//        }
//        return null;
//    }
}
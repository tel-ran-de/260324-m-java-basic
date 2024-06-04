package org.example;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
//        int x = 10;
//        int sum = 0;
//
//        do {
//            sum += x;
//            x--;
//        }
//        while (x > 10);
//        System.out.println(sum);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a value: ");
        int height = 5; //sc.nextInt();
        int a = 0;
        int b = height - 1;
        int c = height + 1;

        for (int j = 0; j < height; j++) {
            for (int i = 0; i < 2 * height; i++) {
                if (j == a && i > b && i < c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            a++;
            b--;
            c++;
            System.out.println();
        }

        a = 0;
        b = height;
        c = height;
        // каркас треугольник
        for (int j = 0; j <= height; j++) {
            for (int i = 0; i <= height * 2; i++) {
                if (j == a && i == b || j == a && i == c || j == height && i <= height * 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            a++;
            b--;
            c++;
            System.out.print("\n");
        }
    }
}

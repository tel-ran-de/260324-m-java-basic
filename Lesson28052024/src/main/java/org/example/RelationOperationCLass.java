package org.example;

import java.util.Random;
import java.util.Scanner;

public class RelationOperationCLass {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input start value(min 0):");
//        int startFirst = sc.nextInt();
//        System.out.println("Input end value(max 10):");
//        int endFirst = sc.nextInt();
//        System.out.println("Input start value(min 5):");
//        int startSecond = sc.nextInt();
//        System.out.println("Input end value(max 15):");
//        int endSecond = sc.nextInt();
//        Random random = new Random();
//        int value = random.nextInt(startFirst - 10, endSecond + 10);
//        System.out.println("Random point is " + value);
//        boolean result = getResult(startFirst, endFirst, startSecond, endSecond, value);
        boolean result = getResult();
//        System.out.println("Is our array contain " + value + ": " + result);
//        System.out.println("Is our arrays contain " + value + ": " + result);
        System.out.println("Is our arrays contain " + ": " + result);

    }

//    public static boolean getResult(int startFirst, int endFirst, int startSecond, int endSecond, int value) {
//        return  (value >= startFirst && value <= endFirst) ||
//                (value >= startSecond && value <= endSecond);
//
//    }

    public static boolean getResult() {
        int startFirst = 0;
        int endFirst = 10;
        int startSecond = 5;
        int endSecond = 15;
        int value = 7;
        return  (value >= startFirst && value <= endFirst) ||
                (value >= startSecond && value <= endSecond);

    }
}

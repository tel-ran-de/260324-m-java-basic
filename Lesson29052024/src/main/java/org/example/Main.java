package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input start value(min 0):");
        int startFirst = 1;//sc.nextInt();
//        System.out.println("Input end value(max 10):");
        int endFirst = 10; //sc.nextInt();
//        System.out.println("Input start value(min 5):");
        int startSecond = 5;//sc.nextInt();
//        System.out.println("Input end value(max 15):");
        int endSecond = 15; //sc.nextInt();
        Random random = new Random();
        int value = 20;//random.nextInt(startFirst - 10, endSecond + 10);
        System.out.println("Random point is " + value);
        getResult(startFirst, endFirst, startSecond, endSecond, value);

    }

//    ladder if
//    public static void getResult(int startFirst, int endFirst, int startSecond, int endSecond, int value) {
//        if ((value >= startFirst && value <= endFirst) && (value >= startSecond && value <= endSecond)) {
//            System.out.println("Both ranges contain value " + value);
//        } else if ((value >= startFirst && value <= endFirst) && !(value >= startSecond && value <= endSecond)) {
//            System.out.println("Fist range contains value: " + value);
//        } else if (!(value >= startFirst && value <= endFirst) && (value >= startSecond && value <= endSecond)) {
//            System.out.println("Second range contains value: " + value);
//        } else {
//            System.out.println("Current value is out of our ranges");
//        }
//    }

//    nested if
    public static void getResult(int startFirst, int endFirst, int startSecond, int endSecond, int value) {
        if (value >= startFirst && value <= endSecond) {
            if ((value >= startFirst && value <= endFirst) && (value >= startSecond && value <= endSecond)) {
                System.out.println("Both ranges contain value " + value);
            } else if ((value >= startFirst && value <= endFirst) && !(value >= startSecond && value <= endSecond)) {
                System.out.println("Fist range contains value: " + value);
            } else if (!(value >= startFirst && value <= endFirst) && (value >= startSecond && value <= endSecond)) {
                System.out.println("Second range contains value: " + value);
            }
        } else {
            System.out.println("Current value is out of our ranges");
        }
    }
}
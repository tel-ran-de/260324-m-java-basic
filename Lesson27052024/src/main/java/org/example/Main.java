package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input value");
//        String str = scanner.nextLine();
//        System.out.println("Your input is " + str);
        Scanner scanner = new Scanner(System.in);
        String wordOne = scanner.nextLine();
        String wordTwo = scanner.nextLine();

        if ((wordOne.length() + wordTwo.length()) % 2 != 0) {
            System.out.println("Invalid input");
            return;
        }

        System.out.println((wordOne.substring(0, wordOne.length()/2)) + (wordTwo.substring(wordTwo.length()/2)));
    }

//    public static void findEvenOdd(int num)  {
//        if (num % 2 == 0) {
//            System.out.println(num+" is even"); }
//        else  {
//            System.out.println(num+" is odd");  }
//    }

}
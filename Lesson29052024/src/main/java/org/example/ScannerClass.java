package org.example;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number: ");

//        integer
//        int num = scanner.nextInt();
//        System.out.println("You entered a number " + num);
//        System.out.println("You entered a number (mult 10) " + num*10);

//        double
//        System.out.println("Please enter a float number: ");
//        double numDouble = scanner.nextDouble();
//        System.out.println("You entered a number " + numDouble);

//        string
        Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
                "Люблю твой строгий, стройный вид,\n" +
                "Невы державное теченье,\n" +
                "Береговой ее гранит");
//        read one line
//        String line = scanner.nextLine();
//        System.out.println(line);
//        String line1 = scanner.nextLine();
//        System.out.println(line1);

//        read by word
        String word = scanner.next();
        System.out.println(word);
//        String word1 = scanner.next();
//        System.out.println(word1);

    }
}

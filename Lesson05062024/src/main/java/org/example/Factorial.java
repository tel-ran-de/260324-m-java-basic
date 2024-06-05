package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        int num = sc.nextInt();
//        System.out.println(num + "! = " + getFactorial(num));
        int pol = 1234321;
        System.out.println("Is palindrome " + isPalindrome(pol));
        System.out.println("Is palindrome str " + isStrPol("1234321"));
    }

    public static int getFactorial(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

    public static boolean isPalindrome(int num) {
        int r,sum=0,temp;

        temp=num;
        while(num > 0){
            r=num%10;  //getting remainder
            sum=(sum*10)+r;
            num=num/10;
        }
        return temp==sum;
    }

    public static boolean isStrPol(String str) {
        StringBuilder sb = new StringBuilder(str);
        return Objects.equals(str, sb.reverse().toString());
    }
}
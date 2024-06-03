package org.example;

public class InfinityForLoop {
    public static void main(String[] args) {
//        for(;;) {
//            System.out.println("Hello");
//            break;
//        }

//        for(int i = 0; i >= 0; i++) {
//            System.out.println("Hello");
//        }
// mult table 2 and 3
        for (int i = 2; i < 4; i++ ) {
            for (int j = 2; j <= 9; j++) {
                System.out.println( i + " * " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}

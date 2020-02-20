package com.enigma;

import java.util.Scanner;

public class TriangleStars {
    public static void main(String[] args) {
        System.out.println("================ Java Triangle ================");
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Input Pertama : ");
//        int firsInput = scanner.nextInt();
        System.out.print("Input Kedua : ");
        int secondInput = scanner.nextInt();
        yourSolution(secondInput);
    }
    static void yourSolution(int numOfRows){
//        for (int i = 0; i < qtyPiramid; i++) {
            for (int j = 0; j < numOfRows; j++) {
                for (int k = 0; k <numOfRows-j ; k++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= j ; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        System.out.print("\t");
        for (int f = 0; f < 4; f++) {
            for (int k = 0; k <4-f ; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= f ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.print("\t");

    }
}

package com.enigma;

import java.util.Scanner;

public class PyramidStars {
    public static void main(String[] args) {
        System.out.println("=================== Pyramid Java Stars Looping ===================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Pertama : ");
        int firsInput = scanner.nextInt();
        System.out.print("Input Kedua : ");
        int secondInput = scanner.nextInt();
        getPyramid(firsInput, secondInput);
    }

    public static void getPyramid(Integer firstInput, Integer secondInput) {
        for (int i = 0; i < firstInput; i++) {
            for (int j = 0; j < secondInput; j++) {
                for (int k = secondInput - 1; k > j; k--) {
                    System.out.print(" ");
                }
                for (int l = 0; l <= j; l++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.print("\n");
        }
    }
}

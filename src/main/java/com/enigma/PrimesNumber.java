package com.enigma;

import java.util.Scanner;

public class PrimesNumber {
    public static void main(String[] args) {
        System.out.println("========================= Java Prime Number =========================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Range : ");
        int input = scanner.nextInt();

        for (int i = 2; i < input; i++) {
            boolean isPrimes = true;
            for (int j = 2; j < i ; j++) {
                if (i % j == 0) {
                    isPrimes = false;
                    break;
                }
            }

            if (isPrimes) {
                System.out.print(i+ ",");
            }
        }
    }
}

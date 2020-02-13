package com.enigma;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println("========================== Java Fibonacci Number ==========================");

        Scanner scanner = new Scanner(System.in);
        Integer[] input = new Integer[scanner.nextInt()];
        input[0] = 0;
        input[1] = 1;

        for (int i = 2; i < input.length; i++) {
            input[i] = input[i - 1] + input[i -2];
        }

        for (Integer integer : input) {
            System.out.print(integer + " ");
        }
    }
}

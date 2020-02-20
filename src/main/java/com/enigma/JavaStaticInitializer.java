package com.enigma;

import java.util.Scanner;

public class JavaStaticInitializer {
    public static void initializer(int low, int high) {
        if (low <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(high);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = scanner.nextInt();
        int high = scanner.nextInt();

        initializer(low, high);
    }
}

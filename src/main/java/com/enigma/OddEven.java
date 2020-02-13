package com.enigma;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("=========================== Odd Even Number Check ===========================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Your Number: ");
        int input = scanner.nextInt();

        if (input % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
    }
}
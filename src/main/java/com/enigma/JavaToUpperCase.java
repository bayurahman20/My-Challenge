package com.enigma;

import java.util.Scanner;

public class JavaToUpperCase {
    public static void main(String[] args) {
        System.out.println("=================== Java To UpperCase ===================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Your Words: ");
        String input = scanner.nextLine();

        int valueInput = 0;
        for (int i = 0; i < input.length(); i++) {
            valueInput = i - 1;
        }

        System.out.println(valueInput);
        System.out.println("NO");

    }
}

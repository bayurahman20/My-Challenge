package com.enigma;

import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        System.out.println("=================== Java Substring ===================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Your Word :");
        String input = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        String subs = input.substring(start, end);
        System.out.println(subs);
    }
}

package com.enigma;

import java.util.Scanner;

public class SuperDromes {
    public static void main(String[] args) {
        System.out.println("==================== Java Superdromes ====================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Your Number : ");
        int input = scanner.nextInt();
        System.out.println(solve(input));
    }

    static String solve(long n) {
        long i = 0;
        i = Integer.parseInt(binary(n));
        if (isPalindrome("" + n)) {
            if (isPalindrome("" + i)) {
                System.out.println(i);
            }
        }
        return n + " Number Is Not SuperDrome";
    }

    static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    static String binary(long y) {
        long a = 0;
        if (y > 0) {
            a = y % 2;
            return (binary(y / 2) + "" + a);
        }
        return "" + a;
    }
}

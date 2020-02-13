package com.enigma;

import java.util.Scanner;

public class NumberToFly {
    static String[] alphabet = {"", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
    static String belas = " Belas";
    static String puluh = " Puluh ";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Number: ");
        System.out.println(new NumberToFly().numberToFly(scanner.nextLong()));
    }

    public String numberToFly(Long numbers) {
        if (numbers < 12) {
            return alphabet[numbers.intValue()];
        }
        if (numbers <= 19) {
            return alphabet[numbers.intValue() % 10] + belas;
        }
        if (numbers < 99) {
            return alphabet[numbers.intValue() / 10] + puluh + alphabet[numbers.intValue() % 10];
        }
        return null;
    }
}
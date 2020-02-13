package com.enigma;

import java.util.Scanner;

public class ConvertNumericWithSentence {
    static String[] say = {"Noll", "Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
    public static void main(String[] args) {
        System.out.println("======================== Java Numeric With Sentence Number To Fly ========================");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Angka: ");
        System.out.println(new ConvertNumericWithSentence().numberToFly(scanner.nextLong()));
    }

    public static String numberToFly(Long number) {
        if (number <= 999999) {
            return numberToFly(number / 1000) + " " + numberToFly(number % 1000);
        }
        return null;
    }
}

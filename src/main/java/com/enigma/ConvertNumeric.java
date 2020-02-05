package com.enigma;

import java.util.Scanner;

public class ConvertNumeric {
    static String[] alphabet = {"Nol","Satu", "Dua", "Tiga", "Empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};
    static String belasan = " Belas";
    static String puluhan = " Puluh ";
    static String ratusan = " Ratus ";
    static String seratus = "Seratus ";
    static String ribuan = " Ribu ";
    static String seribu = "Seribu ";
    static String jutaan = " Juta ";
    static String milyaraan = " Milyar ";
    static String triliunan = " Triliun ";
    static String quadrilyun = " Quadrilyun ";
    public static void main(String[] args) {
        System.out.println("======================================== Java Convert Numeric ========================================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Your Number : ");
        System.out.println(new ConvertNumeric().numberToFly(scanner.nextLong()));
    }

    public static String numberToFly(Long numbers) {
        if (numbers < 12) {
            return alphabet[numbers.intValue()];
        }
        if (numbers <= 19) {
            return alphabet[numbers.intValue() % 10] + belasan;
        }
        if (numbers <= 99) {
            return numberToFly(numbers / 10) + puluhan + alphabet[numbers.intValue() % 10];
        }
        if (numbers <= 199) {
            return seratus + numberToFly(numbers % 100);
        }
        if (numbers <= 999) {
            return numberToFly(numbers / 100)+ ratusan + numberToFly(numbers % 100);
        }
        if (numbers <= 1999) {
            return seribu + numberToFly(numbers % 1000);
        }
        if (numbers < 9999) {
            return numberToFly(numbers / 1000) + ribuan + numberToFly(numbers % 1000);
        }
        if (numbers <= 999999) {
            return numberToFly(numbers / 1000) + ribuan + numberToFly(numbers % 1000);
        }
        if (numbers <= 999999999) {
            return numberToFly(numbers / 1000000) + jutaan + numberToFly(numbers % 1000000);
        }
        if (numbers <= 999999999999L) {
            return numberToFly(numbers / 1000000000) + milyaraan + numberToFly(numbers % 1000000000);
        }
        if (numbers <= 999999999999999L) {
            return numberToFly(numbers / 100000000000L) + triliunan + numberToFly(numbers % 100000000000L);
        }
        if (numbers <= 999999999999999999L) {
            return numberToFly(numbers / 1000000000000000L) + quadrilyun + numberToFly(numbers % 1000000000000000L);
        }
        return null;
    }
}
package com.enigma;

import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        System.out.println("================== Replace Character ==================");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Your Character : ");
        String input = scanner.nextLine();

        input = input.toLowerCase();
        input = input.replaceAll("[a,i,u,e,o]","i");
        System.out.println(input);
    }
}

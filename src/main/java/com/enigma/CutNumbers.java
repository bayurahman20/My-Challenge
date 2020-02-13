package com.enigma;

import java.util.Scanner;

public class CutNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Your Number :");
        int enter = scanner.nextInt();

        for (int x = 0; x < enter; x++){

            for (int i = 1; i <= enter; i++){
                for (int j = 1; j <= i; j++){
                    if (i <= x){
                        System.out.print("#");
                    } else {
                        System.out.print(i);
                    }
                }
            }
            for (int p = (enter -1); p >= 1; p-- ){
                for (int q = p; q >= 1; q--){
                    if (p <= x){
                        System.out.print("#");
                    } else {
                        System.out.print(p);
                    }
                }
            }
            System.out.println();
        }
    }
}

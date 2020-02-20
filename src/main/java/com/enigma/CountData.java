package com.enigma;

public class CountData {
    public static void main(String[] args) {
        System.out.println("========================= Count Data =========================");
        String[] data = {"Jakarta", "Jakarta", "Jakarta", "Surabaya", "Bandung", "Bandung"};

        int jakarta = 0;
        int surabaya = 0;
        int bandung = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals("Jakarta")) {
                jakarta+=1;
            } else if (data[i].equals("Surabaya")) {
                surabaya+=1;
            } else if (data[i].equals("Bandung")) {
                bandung+=1;
            }
        }

        System.out.println("Jakarta :"+jakarta);
        System.out.println("Surabaya :"+surabaya);
        System.out.println("Bandung :"+bandung);
    }
}

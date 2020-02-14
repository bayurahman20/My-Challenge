package com.enigma;

import java.io.*;

public class JavaWriteFile {
    final static File path = new File("/home/developer/Documents/Explore/Challenges/src/main/java/resource/bufferedwriter.txt");
    public static void main(String[] args) throws IOException {
        System.out.println("========================== Java Write File With Buffered Writer ==========================");

        BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input Words : ");
            writer.newLine();
            writer.append("Sang Developer Java");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

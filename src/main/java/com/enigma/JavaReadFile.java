package com.enigma;

import java.io.*;

public class JavaReadFile {
    final static File path = new File("/home/developer/Documents/Explore/Challenges/src/main/java/resource/bufferedwriter.txt");
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while (true) {
                String text = reader.readLine();
                if (text == null) break;
                System.out.println(text);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
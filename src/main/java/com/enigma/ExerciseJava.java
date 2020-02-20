package com.enigma;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseJava {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("madam"));
        System.out.println(findPalindrome("madam"));

    }

    static ArrayList<String> findPalindrome(String str){
        ArrayList<String> answers = new ArrayList<String>();
        answers.add(checkPalindrome(str));
        for (int i = 0; i < answers.size() ; i++) {
            if(answers.get(i).equalsIgnoreCase(checkPalindrome(str))){
                 answers.add(checkPalindrome(str));
            }else{
                return null;
            }
        }
        return answers;
    }

    static String checkPalindrome(String s){
        int len = s.length();
        for (int i = 0; i <len/2 ; i++) {
            if(s.charAt(i) != s.charAt(len -1- i)){
                return "not palindrome";
            }else{
                return s;
            }
        }
        return s;
    }
}

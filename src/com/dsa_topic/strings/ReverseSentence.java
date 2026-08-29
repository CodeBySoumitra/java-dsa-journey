package com.dsa_topic.strings;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();

        String[] words = str.split("\\s+");


        for(int i = words.length - 1; i >= 0; i--){
            System.out.print(words[i]+" ");
        }
        sc.close();
    }
}

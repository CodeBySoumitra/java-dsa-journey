package com.soumitra.strings;

import java.util.Scanner;

public class CountFrequencyOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();
        str = str.toLowerCase();
        System.out.print("Enter a character from above sentence: ");
        char ch = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                count++;
            }
        }
        System.out.print("Frequency of "+ch+" is: "+count);
        sc.close();

    }
}

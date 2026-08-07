package com.soumitra.strings;

import java.util.Scanner;

public class RemoveDuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();
        str = str.toLowerCase();
        String sb = "";
        //char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(sb.indexOf(ch) == -1){
                sb += ch;
            }
        }
        System.out.print("Atfer remove duplicate character: "+sb);
        sc.close();

    }
}

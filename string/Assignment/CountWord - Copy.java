package com.soumitra.strings;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();
        if(str.isEmpty()){
            System.out.print("Word count is: 0");
        }
        else{
            String[] words = str.split(" ");
            System.out.print("Word count is: "+words.length);
        }
        sc.close();
    }
}

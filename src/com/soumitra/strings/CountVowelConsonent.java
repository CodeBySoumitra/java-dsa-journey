package com.soumitra.strings;

import java.util.Locale;
import java.util.Scanner;

public class CountVowelConsonent {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String str = sc.nextLine();
        String name = str.toLowerCase();
        int v = 0;
        int con = 0;
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u'){
                v++;
            }
            else{
                con++;
            }
        }
        System.out.println("Total no. of vowels is = "+v+" and total no. of consonents is = "+con);
        sc.close();
    }
}

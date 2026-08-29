package com.dsa_topic.strings;

import java.util.Scanner;

public class CountUpperLowerChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int up = 0,
            lo = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                lo++;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                up++;
            }
        }
        System.out.print("\nTotal uppercase characters is = "+(up)+" and total lowercase character is "+lo);
        sc.close();
    }
}

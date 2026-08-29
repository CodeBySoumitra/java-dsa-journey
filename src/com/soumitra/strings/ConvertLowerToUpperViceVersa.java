package com.soumitra.strings;

import java.util.Scanner;

public class ConvertLowerToUpperViceVersa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                sb.append((char)(ch - 32));

            } else if (ch >= 'A' && ch <= 'Z') {
                sb.append((char)(ch + 32));
            }
            else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}

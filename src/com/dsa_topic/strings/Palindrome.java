package com.dsa_topic.strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                System.out.println("Not palindrom");
                return;
            }
            left++;
            right--;
        }
        System.out.println("palindrome");


        sc.close();
    }
}

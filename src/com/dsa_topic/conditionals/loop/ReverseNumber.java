package com.dsa_topic.conditionals.loop;

import java.util.Scanner;

public class ReverseNumber {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int temp = num;
        int reverse = 0;
        while(num > 0){
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        System.out.print("Reverse of "+temp+" is = "+reverse);
    }
}

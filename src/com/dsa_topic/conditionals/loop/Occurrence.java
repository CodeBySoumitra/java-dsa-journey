package com.dsa_topic.conditionals.loop;

import java.util.Scanner;

public class Occurrence {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter number :");
        num = sc.nextInt();
        System.out.print("Enter digit from number "+num+" : ");
        int digit = sc.nextInt();
        int count = 0;
        while(num > 0){
            int rem = num % 10;
            if(rem == digit){
                count++;
            }
            num = num / 10;
        }
        System.out.println("Occurrence of "+digit+" are "+count);
    }
}

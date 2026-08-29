package com.dsa_topic.conditionals.iflese;

import java.util.Scanner;

public class Largest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
        if(a > b){
            if(a > c){
                max = a;
            }
            else{
                max = c;
            }
            //System.out.println(a+" is largest");
        }
        else{
            if(b > c){
                max = b;
            }
            else {
                max = c;
            }
        }
        System.out.println(max+" is largest");
        sc.close();
    }
}

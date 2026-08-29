package com.dsa_topic.conditionals.iflese;

import java.util.Scanner;

public class CaseCheck {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().trim().charAt(0);
        if(ch > 'a' && ch < 'z'){
            System.out.println("Lowecase");
        }
        else{
            System.out.println("UpperCase");
        }
        sc.close();
    }
}

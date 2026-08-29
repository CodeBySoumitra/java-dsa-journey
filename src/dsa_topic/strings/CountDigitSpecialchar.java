package dsa_topic.strings;

import java.util.Scanner;

public class CountDigitSpecialchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int digit = 0;
        int spechar = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                digit++;
            }
            else if(!Character.isLetterOrDigit(ch)){
                spechar++;
            }
        }
        System.out.println("Total digit: "+digit);
        System.out.println("Total special char: "+spechar);
        sc.close();

    }
}

package dsa_topic.strings;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println("Toggle String: "+sb);
        sc.close();

    }
}

package dsa_topic.strings;

import java.util.Scanner;

public class PrintCharacter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        for (int i = 0; i < name.length(); i++){
            System.out.print(name.charAt(i)+"");
        }
        sc.close();
    }
}

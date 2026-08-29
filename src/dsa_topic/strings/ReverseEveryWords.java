package dsa_topic.strings;

import java.util.Scanner;

public class ReverseEveryWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();

        String[] words = str.split(" ");
        int n = words.length;

        for(int i = 0; i < n; i++){
            String word = words[i];
            int wn = word.length();
            for(int j = wn - 1; j >= 0; j--) {
                System.out.print(word.charAt(j));
            }
            System.out.print(" ");
        }
        sc.close();
    }
}

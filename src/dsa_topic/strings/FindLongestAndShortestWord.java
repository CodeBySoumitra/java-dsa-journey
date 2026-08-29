package dsa_topic.strings;

import java.util.Scanner;

public class FindLongestAndShortestWord {
    public static void main(String[] args) {
        String LogWord = "";
        String shorWord = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();

        String[] words = str.split("\\s+");
        int n = words.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            String word = words[i];
            int wn = word.length();
            if(max < wn){
                max = wn;
                LogWord = word;
            }
            if(min > wn){
                min = wn;
                shorWord = word;
            }
        }
        System.out.println("Longest word: "+LogWord);
        System.out.println("Shortest word: "+shorWord);
        sc.close();

    }
}

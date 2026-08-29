package dsa_topic.conditionals.loop;
import java.util.Scanner;

public class Fibonacci {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter nth term: ");
        n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        int f = 0;
        System.out.print("Fibonacci series upto "+n+"th term : ");
        System.out.print(a+" "+b+" ");
        while(count < n){
            f = a+b;
            a = b;
            b = f;
            count++;
            System.out.print(f+" ");
        }
        System.out.println();
        System.out.println(n+"th fibonacci term is: "+f);
        sc.close();
    }

}

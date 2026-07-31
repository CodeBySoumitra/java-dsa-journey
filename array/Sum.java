package com.soumitra.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sum  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter  5 array element one by one: ");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        //System.out.print("Array is: "+ Arrays.toString(arr));
        int sum = 0;
        System.out.print("Sum of Array element  is : ");
        for (int num : arr){
            sum += num;
            //System.out.print(num+" ");
        }
        System.out.print(sum);
    }
}

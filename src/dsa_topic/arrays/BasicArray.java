package dsa_topic.arrays;

import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        maxEle(arr);
        minEle(arr);
        avgEle(arr);
        countEvenOrOdd(arr);
        reverseArr(arr);
    }

    public static void inputArr(int[] arr){
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        System.out.print("Enter "+n+" array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void printArr(int[] arr){
        System.out.print("Array elements: ");
        for(int num : arr){
            System.out.print(num+" ");
        }
    }

    public static void minEle(int[] arr){
        BasicArray.inputArr(arr);
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        BasicArray.printArr(arr);
        System.out.println();
        System.out.print("Minimum element is: "+min);
    }

    public static void maxEle(int[] arr){
        BasicArray.inputArr(arr);
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        BasicArray.printArr(arr);
        System.out.println();
        System.out.print("Maximum element is : "+max);
    }

    public static void avgEle(int[] arr){
        inputArr(arr);
        double avg = 0.0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = (double) sum / arr.length;
        System.out.print("Average of elements is: "+avg);
    }

    public static void countEvenOrOdd(int[] arr){
        inputArr(arr);
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] % 2 == 0){
                countEven++;
            }
            else {
                countOdd++;
            }
        }
        System.out.println("Total Even elements are: "+countEven);
        System.out.println("Total Odd elements are: "+countOdd);
    }

    public static void reverseArr(int[] arr){
        inputArr(arr);
        System.out.print("Reverse Array is: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}

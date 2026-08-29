package com.dsa_topic.arrays;

public class Minmum {
    static void main(String[] args) {
        int[] arr = new int[5];
        minEle(arr);
    }
    static void minEle(int[] arr){
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
}

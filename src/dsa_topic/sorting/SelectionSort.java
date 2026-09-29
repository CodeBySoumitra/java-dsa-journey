package dsa_topic.sorting;

import static dsa_topic.sorting.BubbleSort.swap;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {11,5,3,8,4,2};
        System.out.println("SELECTION SORT");
        System.out.println("Before Sorting: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        selectionSort(arr);


        System.out.println("\nAfter Sorting: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }


    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            int smallest = i;
            for(int j = i+1; j < n; j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            swap(arr,i,smallest);
        }
    }
}

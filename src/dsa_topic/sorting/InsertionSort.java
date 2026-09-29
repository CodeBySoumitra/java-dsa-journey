package dsa_topic.sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {11,5,3,8,4,2};
        System.out.println("INSERTION SORT: ");
        System.out.println("Before Sorting: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        insertionSort(arr);


        System.out.println("\nAfter Sorting: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}

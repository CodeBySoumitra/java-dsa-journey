package dsa_topic.sorting;


public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            boolean swapped = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public static void main(String[] arg) {
        int[] arr = {11,5,3,8,4,2};
        System.out.println("Before Sorting: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        bubbleSort(arr);


        System.out.println("\nAfter Sorting: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

    }
}

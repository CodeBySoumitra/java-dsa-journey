package dsa_topic.arrays;

public class Maximum {
    public static void main(String[] args) {
        int[] arr = new int[5];
        MaxEle(arr);

    }
    public static void MaxEle(int[] arr){
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
}

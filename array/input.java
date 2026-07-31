public static void inputArr(int[] arr){
        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        System.out.print("Enter "+n+" array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

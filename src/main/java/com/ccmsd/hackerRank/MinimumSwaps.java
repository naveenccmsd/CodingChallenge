package com.ccmsd.hackerRank;


public class MinimumSwaps {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int[] store = new int[arr.length + 1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            store[arr[i]] = i;
        }
//        System.out.println(Arrays.toString(store));
//        System.out.println(Arrays.toString(arr));
//        System.out.println("******");

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                int one = arr[j];
                int two = arr[store[j + 1]];
                arr[j] = two;
                arr[store[j + 1]] = one;

                int tempPos = store[one];
                store[one] = store[two];
                store[two] = tempPos;
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 4, 6, 7 };
        System.out.println(MinimumSwaps.minimumSwaps(arr));
    }

}

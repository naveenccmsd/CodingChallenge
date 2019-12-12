package com.ccmsd.hackerRank.sortold;

import java.util.Arrays;


public class InsertionSort {

    public static void main(String srgs[]) {
        int arr[] = { 9, 7, 5, 11, 12, 2, 14, 3, 10, 6 };
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));


        }
    }
}

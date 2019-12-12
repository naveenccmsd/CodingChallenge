package com.ccmsd.hackerRank.sortold;

import java.util.Arrays;


public class SelectionSort {

    public static void main(String srgs[]) {
        int arr[] = { 9, 7, 5, 11, 12, 2, 14, 3, 10, 6 };
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            BubbleSort.swap(arr, i, minIndex);
        }
    }
}

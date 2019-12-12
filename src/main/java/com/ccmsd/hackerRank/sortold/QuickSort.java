package com.ccmsd.hackerRank.sortold;

import java.util.Arrays;


public class QuickSort {

    public static void main(String srgs[]) {
        int arr[] = { 9, 7, 5, 11, 12, 2, 14, 3, 10, 6 };
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = partition(arr, low, high);
            quickSort(arr, low, middle - 1);
            quickSort(arr, middle + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int pos = low;
        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                BubbleSort.swap(arr, i, pos);
                pos++;
            }
        }
        BubbleSort.swap(arr, high, pos);
        return pos;
    }
}

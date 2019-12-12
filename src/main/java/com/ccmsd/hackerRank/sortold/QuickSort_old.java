package com.ccmsd.hackerRank.sortold;

import java.util.Arrays;


public class QuickSort_old {

    public static void main(String srgs[]) {
        int arr[] = { 9, 7, 5, 11, 12, 2, 14, 3, 10, 6 };
         System.out.println(Arrays.toString(arr));
        sort(arr);
        

    }

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);

    }

    private static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int middle;
            middle = partition(arr, low, high);
            System.out.println(arr[middle] + " => " + Arrays.toString(arr));
//            System.exit(0);
            quickSort(arr, low, middle - 1);
            quickSort(arr, middle + 1, high);
        }

    }

    private static int partition(int[] arr, int first, int last) {
        int pivot = arr[last];
        int i = first;
        for (int j = first; j < last; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
             System.out.println(Arrays.toString(arr));
        }
        swap(arr, i, last);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

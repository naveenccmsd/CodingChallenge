package com.ccmsd.hackerRank.sortold;

import java.util.Arrays;


public class MergeSort_old {

    public static void main(String srgs[]) {
        int arr[] = { 9, 7, 5, 11, 12, 2, 14, 3, 10, 6 };
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);

    }

    private static void mergeSort(int[] arr, int low, int high) {

        int middle;
        if (low < high) {
            middle = (low + high) / 2;
            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);
            merge(arr, low, middle, high);
        }

    }

    private static void merge(int[] arr, int low, int middle, int high) {

        int n1 = middle - low + 1;
        int n2 = high - middle;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[middle + 1 + i];
        }
        int i = 0, j = 0;
        int index = low;
        while (i < n1 && j < n2) {

            if (left[i] <= right[j]) {
                arr[index] = left[i];
                i++;
            } else {
                arr[index] = right[j];
                j++;
            }
            index++;
        }

        while (i < n1) {
            arr[index] = left[i];
            i++;
            index++;
        }
        while (j < n2) {
            arr[index] = right[j];
            j++;
            index++;
        }

    }
}

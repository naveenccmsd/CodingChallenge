package com.ccmsd.algorithm.sort;

import java.util.Arrays;


public class Sort {

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 9, 7, 5, 11, 12, 2, 14, 3, 10, 6, -2, -19 };
        int arr1[] = new int[arr.length];
        System.arraycopy(arr, 0, arr1, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------Bubble Sort---------");
        bubbleSort(arr);
        System.out.println("--------------Insertion Sort---------");
        insertionSort(arr1);
        // System.out.println(Arrays.toString(arr));

    }

    private static void bubbleSort(int[] arr) {
        for (int lastUnSortedIndex = arr.length - 1; lastUnSortedIndex > 0; lastUnSortedIndex--) {
            for (int i = 0; i < lastUnSortedIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
            System.out.println(Arrays.toString(arr));

        }
    }

    private static void selectionSort(int[] arr) {
        for (int lastUnSortedIndex = arr.length - 1; lastUnSortedIndex > 0; lastUnSortedIndex--) {
            int largestIndex = 0;
            for (int i = 0; i <= lastUnSortedIndex; i++) {
                if (arr[i] > arr[largestIndex]) {
                    largestIndex = i;
                }
            }
            swap(arr, largestIndex, lastUnSortedIndex);
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void insertionSort(int[] arr) {
        for (int firstunSortedIndex = 1; firstunSortedIndex < arr.length; firstunSortedIndex++) {
            int newElement = arr[firstunSortedIndex];
            int i;
            for (i = firstunSortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = newElement;
            System.out.println(Arrays.toString(arr));

        }
    }
}

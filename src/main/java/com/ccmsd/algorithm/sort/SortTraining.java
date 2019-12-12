package com.ccmsd.algorithm.sort;

import java.util.Arrays;


public class SortTraining {

    private static void swap(int[] arr, int i, int j) {
        if (i == j)
            return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int arr[] = { 9, 7, 5, 11, 12, 2, 14, 3, 10, 6, -2, -19 };
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length);

    }

    private static void quickSort(int[] arr, int start, int end) {
        if ((end - start) < 2) {
            return;
        }
        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex);
        quickSort(arr, pivotIndex + 1, end);

    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int fisrtSmallIndex = start;
        for (int i = start + 1; i < end; i++) {
            if (arr[i] <= pivot) {
                fisrtSmallIndex++;
                swap(arr, fisrtSmallIndex, i);
            }
        }
        swap(arr, fisrtSmallIndex, start);
        return fisrtSmallIndex;
    }

    private static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length);

    }

    private static void mergeSort(int[] arr, int start, int end) {

        if ((end - start) < 2) {
            return;
        }
        int mid = (end + start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, mid, end);

    }

    private static void merge(int[] arr, int start, int mid, int end) {

        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] tempArray = new int[end - start];

        while (i < mid && j < end) {
            tempArray[tempIndex++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        while (i < mid) {
            tempArray[tempIndex++] = arr[i++];
        }
        // System.arraycopy(tempArray, 0, arr, start, tempIndex);
        for (int p = start, q = 0; q < tempIndex; p++, q++) {
            arr[p] = tempArray[q];
        }

    }

    private static void insertionSort(int[] arr) {
        for (int firstUnSortedIndex = 1; firstUnSortedIndex < arr.length; firstUnSortedIndex++) {
            int newElement = arr[firstUnSortedIndex];
            int i;
            for (i = firstUnSortedIndex; i > 0 && arr[i - 1] > newElement; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = newElement;
            System.out.println(Arrays.toString(arr));
        }

    }

    private static void bubbleSort(int[] arr) {

        for (int lastInSortedIndex = arr.length - 1; lastInSortedIndex > 0; lastInSortedIndex--) {
            for (int i = 0; i < lastInSortedIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void selectionSort(int[] arr) {
        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largestIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (arr[i] > arr[largestIndex]) {
                    largestIndex = i;
                }
            }
            swap(arr, largestIndex, lastUnsortedIndex);
            System.out.println(Arrays.toString(arr));

        }

    }

}

package com.ccmsd.algorithm.sort;

import java.util.Arrays;


public class Sort_old {

    static void swap(int[] arr, int j, int i) {
        if (i == j) {
            return;
        }
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;

    }

    public static void main(String srgs[]) {
        // int arr[] = { 9, 7, 5, 11, 12, 2, 14, 3, 10, 6, -2, -19 };
        int arr[] = { 9, 7, 5, 11, 12, 2, 14, 3, 10, 6 };

        // int arr[] = { 9, 7 };

        System.out.println(Arrays.toString(arr));
        countSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void countSort(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j++] = i;
                count[i]--;
            }
        }

    }

    private static void heapify(int arr[], int n, int i) {

        int largerst = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largerst]) {
            largerst = l;
        }
        if (r < n && arr[r] > arr[largerst]) {
            largerst = r;
        }

        if (largerst != i) {
            swap(arr, arr[i], arr[largerst]);
            heapify(arr, n, largerst);
        }
    }

    public static void heapSort(int arr[]) {

        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    public static void quickSort(int[] intArray) {
        quickSort(intArray, 0, intArray.length);
    }

    private static void quickSort(int[] intArray, int start, int end) {
        if ((end - start) < 2) {
            return;
        }
        int pivotIndex = partition(intArray, start, end);
        quickSort(intArray, start, pivotIndex - 1);
        quickSort(intArray, pivotIndex + 1, end - 1);
    }

    private static int partition(int[] intArray, int start, int end) {
        int pivot = intArray[start];
        int indexPos = start;
        for (int i = start; i < end; i++) {
            if (intArray[i] <= pivot) {
                swap(intArray, indexPos, i);
                indexPos++;
            }
        }
        swap(intArray, indexPos, start);

        return indexPos;
    }

    public static void mergeSort(int[] intArray) {
        mergeSort(intArray, 0, intArray.length);
    }

    private static void mergeSort(int[] intArray, int start, int end) {
        if ((end - start) < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(intArray, start, mid);
        mergeSort(intArray, mid, end);
        merge(intArray, start, mid, end);

    }

    private static void merge(int[] intArray, int start, int mid, int end) {

        // if (intArray[mid - 1] <= intArray[mid]) {
        // return;
        // }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] tempArray = new int[end - start];

        while (i < mid && j < end) {
            tempArray[tempIndex++] = intArray[i] <= intArray[j] ? intArray[i++] : intArray[j++];
        }
        while (i < mid) {
            tempArray[tempIndex++] = intArray[i++];
        }
        System.arraycopy(tempArray, 0, intArray, start, tempIndex);

    }

    public static void insertionSort(int[] intArray) {

        for (int firstunSortedIndex = 1; firstunSortedIndex < intArray.length; firstunSortedIndex++) {

            int newElement = intArray[firstunSortedIndex];
            int i;
            for (i = firstunSortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }
            intArray[i] = newElement;

        }

    }

    public static void bubbleSort(int[] intArray) {
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int j = 0; j < lastUnsortedIndex; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    swap(intArray, j, j + 1);
                }
            }
        }
    }

    public static void selectionSort(int[] intArray) {
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largestIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largestIndex]) {
                    largestIndex = i;
                }
            }
            swap(intArray, lastUnsortedIndex, largestIndex);

        }
    }
}

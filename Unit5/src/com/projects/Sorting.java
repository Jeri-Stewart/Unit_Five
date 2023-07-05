package com.projects;

/*
Choose one of the following to implement: Insertion Sort Quick Sort Merge Sort

What sorting algorithms have the best runtime efficiency? What are the scenarios for the best case, worst case, and average case runtime efficiency?

the best runtime efficiency is O(n) is the array is already sorted and worst case scenarios is O(n^2) for larger arrays
 */
public class Sorting {
    public static void insertionSort(int[] arr) {
        int n =arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

}

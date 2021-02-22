package com.ice;

/**
 * 时间复杂度：O(n^2)
 * 最好情况下时间复杂度：O(n)
 * 空间复杂度：O(1)
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 6, 2, 7, 9, 8, 0, 4};
        sort(arr);
        print(arr);
    }

//    static void sort(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = i; j > 0; j--) {
//                if (arr[j] < arr[j - 1]) {
//                    swap(arr, j, j - 1);
//               }  else {
//                    break;
//                }
//            }
//        }

    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                swap(arr, j, j - 1);
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void print(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + "  ");
        }
    }
}

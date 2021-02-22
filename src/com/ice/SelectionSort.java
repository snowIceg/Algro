package com.ice;


/**
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 基本不用，不稳
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[]  arr= {5, 1, 3, 6, 2, 7, 9, 8, 0, 4};
        sort(arr);
        print(arr);
    }

    static void swap(int[] arr, int i, int minPos) {
        int temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;
    }

    static void print(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + "  ");
        }
    }

    static void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = (arr[j] < arr[minPos]) ? j : minPos;
            }
            swap(arr, i, minPos);
        }

    }

}

package com.ice;


/**
 * 时间复杂度：O(n^2)
 * 最好情况下时间复杂度：O(n)
 * 空间复杂度：O(1)
 * 基本不用，太慢
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 6, 2, 7, 9, 8, 0, 4};
        sort(arr);
        print(arr);
    }

    protected static void sort(int[] arr) {
        boolean didSwap=false;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j);
                    didSwap=true;
                }
            }
          if(!didSwap){
              return;
          }

        }

    }

    static void swap(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }

    static void print(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + "  ");
        }
    }
}

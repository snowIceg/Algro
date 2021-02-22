package com.ice;

/**
 * 时间复杂度：O(n^1.3)(平均，没人能计算出来精确的)
 * 最好情况下时间复杂度：O(n^（7/6）)
 * 空间复杂度：O(1)
 */
public class ShellSort {
    public static void main(String[] args) {
//        int[] arr = {5, 1, 3, 6, 2, 7, 9, 8, 0, 4};
        int[] arr = {9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2};
        sort(arr);
        print(arr);
    }

    static void sort(int[] arr) {
//        knuth最优间隔 h=h*3+1
        int h = 1;
        while (h < arr.length / 3) {
            h = 3 * h + 1;
        }
        for (; h > 0; h = (h - 1) / 3) {

            for (int i = h; i < arr.length; i++) {
                for (int j = i; j > h - 1; j -= h) {
                    if (arr[j] < arr[j - h]) {
                        swap(arr, j, j - h);
                    }
                }
            }
//            print(arr);
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
        System.out.println("");
    }
}

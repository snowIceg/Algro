package com.ice;

/**
 * 时间复杂度：O(nlgn)
 * 最好情况下时间复杂度：O(n)
 * 最差情况下时间复杂度：O(n^2)（最右侧的数永远最大）
 * 空间复杂度：O(lgn)
 */
public class QuickSort {
    public static void main(String[] args) {
//        int[] arr = {1, 4, 6, 9, 10, 2, 3, 5, 8, 7};
        int[] arr = {7, 3, 2, 6, 8, 1, 9, 5, 4, 10};
        sort(arr, 0, arr.length - 1);
        print(arr);
    }


    static void sort(int[] arr, int leftBound, int rightBound) {
        if (leftBound >= rightBound) return;
        int mid=partition(arr, leftBound, rightBound);
        sort(arr,leftBound,mid-1);
        sort(arr,mid+1,rightBound);
    }

    static int partition(int[] arr, int leftBound, int rightBound) {
        int pivot = arr[rightBound];
        int left = leftBound;
        int right = rightBound - 1;
        while (left <= right) {
            while (left <= right && arr[left] <= pivot) left++;
            while (left <= right && arr[right] > pivot) right--;    //如果=pivot,有和pivot相等的可能会出现在pivot右侧
            if (left < right) swap(arr, left, right);   //不加if会出现左边已经大于右边了，还进行交换
        }
        swap(arr, left, rightBound); //right找的是小于pivot的，所以不能用right交换
        return left;
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

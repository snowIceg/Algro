package com.ice;

/**
 * 时间复杂度：O(nlgn)
 * 最好情况下时间复杂度：O(n)
 * 空间复杂度：O(1)
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 6, 2, 7, 9, 8, 0, 4};
//        int[] arr = {1, 4, 7, 8, 3, 6, 9};
        sort(arr, 0, arr.length -1);
        print(arr);
    }


    static void sort(int[] arr, int left, int right) {
//        base case
        if(left>=right){
            return;
        }
        int mid=left+(right-left)/2;
        sort(arr,left,mid);
        sort(arr,mid+1,right);
        merge(arr, left, mid+1, right);
    }

    //将排好序的左右进行合并
    static void merge(int[] arr, int leftPtr, int rightPtr, int rightBound) {


        int[] temp = new int[rightBound - leftPtr + 1];
        int mid = rightPtr - 1;
        int i = leftPtr, j = rightPtr, k = 0;

        while (i <= mid && j <= rightBound) {
            if (arr[i] < arr[j] && i <= mid) {
                temp[k++] = arr[i++];

            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= rightBound) temp[k++] = arr[j++];
//        赋值给原数组
        for (int n = 0; n < temp.length; n++) {
            arr[leftPtr + n] = temp[n];
        }
//        print(temp);

    }


    static void print(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + "  ");
        }
        System.out.println("");
    }
}

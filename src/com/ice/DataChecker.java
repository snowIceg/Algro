package com.ice;

import java.util.Arrays;
import java.util.Random;

public class DataChecker {

    public static void main(String[] args) {
        check();
    }

    static int[] generateRandomArray() {
        Random r = new Random();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10000);
        }
        return arr;
    }

    static void check() {
        int[] arr1 = generateRandomArray();
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        Arrays.sort(arr1);
        long start = System.currentTimeMillis();

        MergeSort.sort(arr2,0,arr2.length-1);
        long end = System.currentTimeMillis();
        boolean same = true;
        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] != arr2[i]) same = false;
        }
        System.out.println(same ? "right" : "wrong");
        System.out.println("运行时间为： " + (end - start) + " ms");
    }
}

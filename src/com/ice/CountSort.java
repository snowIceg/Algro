package com.ice;


import java.util.Arrays;

/**
 * 时间复杂度：O(n+k) 或O(n)
 * 最差情况下时间复杂度：O(n^2)（最右侧的数永远最大）
 * 空间复杂度：O(n+k)
 */
public class CountSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 9, 4, 2, 5, 8, 2, 3, 5, 8, 7};
        int[] result = sort(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] sort(int[] arr) {
        int[] count = new int[10];
        int[] res = new int[arr.length];
        for (int val : arr) {
            count[val]++;
        }
        for (int i = 0, j = 0; i < 10; i++) {
            while (count[i]-- > 0) {
                res[j++] = i;
            }
        }
        return res;
    }


}



package com.developersview.Arrays;

import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 15/08/22
 */
/*
* Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.



Example 1:

Input:
N = 5, K = 3
arr[] = {1,2,3,4,5}
Output: 3 2 1 5 4
Explanation: First group consists of elements
1, 2, 3. Second group consists of 4,5.


Example 2:

Input:
N = 4, K = 3
arr[] = {5,6,8,9}
Output: 8 6 5 9*/

public class ReverseArrayInGroup {

    // Function to reverse every sub-array formed by
    // consecutive k elements
    public static int[] reverseGroup(int[] array, int n, int k) {
        for (int i = 0; i < n - 1; i += k) {
            int left = i;
            // to handle case when k is not multiple
            // of n
            int right = Math.min(i + k - 1, n - 1);
            int temp;
            while (left < right) {
                temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(reverseGroup(array, array.length, 3)));
    }
}

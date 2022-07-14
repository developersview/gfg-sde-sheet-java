package com.developersview.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 14/07/22
 */
public class LeadersOfArray {
    public static void printLeaders(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            while (j < n) {
                if (arr[i] <= arr[j]) break;
                j++;
            }
            if (j == n) System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] array = {16, 17, 4, 3, 5, 2};
        printLeaders(array);
    }
}

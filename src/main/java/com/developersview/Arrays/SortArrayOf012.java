package com.developersview.Arrays;

import java.util.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 15/07/22
 */
public class SortArrayOf012 {
    public static void sort(int[] arr) {
        int n = arr.length;
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < n; i++) {
            switch (arr[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }
        }
        //updating arrays initial position
        int i = 0;
        while (cnt0 > 0) {
            arr[i++] = 0;
            cnt0--;
        }
        while (cnt1 > 0) {
            arr[i++] = 1;
            cnt1--;
        }
        while (cnt2 > 0) {
            arr[i++] = 2;
            cnt2--;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 0, 1, 2, 0, 0, 1, 0, 2, 1, 2, 1, 2, 2, 1, 0, 1, 1, 2};
        sort(array);
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}

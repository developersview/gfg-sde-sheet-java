package com.developersview.Arrays;

/**
 * @author pranoy.chakraborty
 * @Date 14/07/22
 */
public class EquilibriamPoint {

    static class Element{
        int value;
        int index; // (1-based index)
    }

    public Element findEqilibriamMethod0(int[] arr) {
        Element element = new Element();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int leftSum = 0, rightSum = 0;
            for (int j = i; j >= 0; j--) {
                leftSum += arr[j];
            }
            for (int k = i; k < n; k++) {
                rightSum += arr[k];
            }
            if (leftSum == rightSum) {
                element.value=arr[i];
                element.index=i+1;
                return element;
            }
        }
        return element;
    }

    public int findEqilibriamMethod1(int[] arr) {
        int n = arr.length;
        long sum = 0, leftsum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < n; i++) {
            sum -= arr[i];
            if (leftsum == sum) return i + 1;
            leftsum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        EquilibriamPoint equilibriamPoint = new EquilibriamPoint();
        int[] array0 = {1, 4, 2, 5};
        Element element = equilibriamPoint.findEqilibriamMethod0(array0);
        System.out.println("Equilibrium Element is : "+element.value);
        System.out.println("Equilibrium Element index is : "+element.index);
        int[] array1 = {1, 4, 2, 5};
        System.out.println(equilibriamPoint.findEqilibriamMethod1(array1));
    }
}

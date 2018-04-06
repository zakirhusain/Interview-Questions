package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*1. Find the extra element and its index
            Input : [ 10, 20, 30, 12, 5 ]
            [ 10, 5, 30, 20 ]
            Output : 12 is the extra element in array 1 at index 4*/

        int[] input1 = {10, 20, 30, 12, 5};
        int[] input2 = {10, 20, 30, 5};

        int n = input2.length;
        System.out.println(findExtra(input1, input2, n));
    }

    private static int findExtra(int arr1[], int arr2[], int n)
    {
        System.out.println("N = " + n);
        for (int i=0; i<n; i++) {
            System.out.println(arr1[i] + " = " + arr2[i]);
            if (arr1[i] != arr2[i]) {
                return i;
            }
        }

        return n;
    }
}

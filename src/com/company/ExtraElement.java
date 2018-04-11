package com.company;

import java.util.ArrayList;
import java.util.List;

public class ExtraElement {
    public static void main(String[] args) {
        /*1. Find the extra element and its index
            Input : [ 10, 20, 30, 12, 5 ]
            [ 10, 5, 30, 20 ]
            Output : 12 is the extra element in array 1 at index 4

            Input : [3, 4, 0, -1, 2]
            [-1, 0, 3, 2]
            Output : 4 is the extra element in array 1 at index 1
            */

        int[] input1 = {10, 20, 30, 12, 5};
        int[] input2 = {10, 5, 30, 20};

        for (int i = 0; i < input1.length; i++) {
           if (!findExtraElement(input2, input1[i])) {
               System.out.println(input1[i] + " is the extra element in array 1 at index " + i);
           }
        }

        /*for (Integer val : input1) {
            if(!findExtraElement(input2, val)) {
                System.out.println(val);
            } else {
                //System.out.println(val);
            }
        }
*/
    }

    private static boolean findExtraElement(int[] input1, int value) {
        for (int i = 0; i < input1.length; i++) {
            if (input1[i] == value) {
                return true;
            }
        }
        /*for (Integer intValue : input1) {
            if (intValue == value) {
                return true;
            }
        }*/
        return false;
    }
}

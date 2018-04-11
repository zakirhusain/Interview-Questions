package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DiagonalSum {

    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDifference(int[][] a) {
        /*
         * Write your code here.
         */
        int diagonal1 = 0;
        int diagonal2 = 0;
        int result = 0;
        int size = a.length;

        for (int i = 0, k = size - 1; i < size; i++, k--) {
            for(int j = 0; j < size; j++) {
                if(i == j) {
                    diagonal1 += a[i][j];
                }

            }
            diagonal2 += a[i][k];
        }


        result = Math.abs(diagonal1 - diagonal2);
        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[n][n];

        for (int aRowItr = 0; aRowItr < n; aRowItr++) {
            String[] aRowItems = scan.nextLine().split(" ");

            for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
                int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
                a[aRowItr][aColumnItr] = aItem;
            }
        }

        int result = diagonalDifference(a);
        System.out.println("Result " + result);
      //  bw.write(String.valueOf(result));
    //    bw.newLine();

       // bw.close();
    }
}

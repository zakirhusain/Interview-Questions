package com.company;

public class XPattern {

    public static void main(String[] args) {
        String input = "12345";

        char[] c = input.toCharArray();

        int i, j, l;

        l = c.length;

        for (i = 0; i < l; i++) {
            for (j = 0; j < l; j++) {
                if (i == j) {
                    System.out.print(c[i]);
                } else if (i + j == l - 1 && i != j) {
                    System.out.print(c[i]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

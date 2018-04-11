package com.company;

public class Question1 {

    public static void main(String[] args) {
        String text = "a1b10";

        char[] a;
        char t;
        int i, j, x, f;
        a = text.toCharArray();

        for (i = 0; i < a.length; i = i + 2) {
            t = a[i];
            System.out.println(a[i+2] - 48);
            if( ( a[ i+2 ] - 48) >= 0 && ( a[ i+2 ] - 48 ) <= 9) {
                x = ((a[i+1]-48)*10)+(a[i+2]-48);
                for(f = 0; f < x; f++) {
                    System.out.print(t);
                }
                i++;
            } else {
                for(j=0;j<a[i+1]-48;j++) {
                    System.out.print(t);
                }
            }
        }
    }
}

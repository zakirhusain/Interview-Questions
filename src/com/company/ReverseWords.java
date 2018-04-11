package com.company;

public class ReverseWords {

    public static void main(String[] args) {
        String sentence = "One Two Three";

        char[] value = sentence.toCharArray();
        int count = 0;
        for (int i = value.length - 1; i >= 0; i-- ) {
            count = count + 1;
            if (value[i] == ' ' || i == 0) {
                for (int j = i; j <= (i+count); j++) {
                    System.out.print(value[j]);
                }
                count = 0;
            }
        }
    }
}

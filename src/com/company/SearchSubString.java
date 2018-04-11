package com.company;

public class SearchSubString {

    public static void main(String[] args) {
        String string1 = "test123string";
        String string2 = "123";
        StringBuilder builder = new StringBuilder();

        char[] input1 = string1.toCharArray();
        char[] input2 = string2.toCharArray();
        int index;
        for (int i = 0; i < input2.length; i++) {
            for (int j = 0; j < input1.length; j++) {
                if (input1[j] == input2[i]) {

                    builder.append(input1[j]);
                    if (builder.toString().equals(string2)) {

                        break;
                    }
                }
            }
        }

        System.out.println(builder.toString());
    }
}

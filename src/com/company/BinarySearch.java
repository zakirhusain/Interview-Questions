package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    private int[] data;
    private Random generator;

    private BinarySearch(int size) {
        generator = new Random();
        data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = 10 + generator.nextInt(90);
        }

        Arrays.sort(data);
    }

    private int binarySearch(int searchKey) {
        // low end of a search area
        int low = 0;
        int high = data.length - 1;
        int middle = (low + high + 1) / 2;
        int location = -1;

        do {
            if (searchKey == data[middle])
                location = middle;
            else if (searchKey < data[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
            // relocate the middle
            middle = (low + high + 1) / 2;
        } while ((low <= high) && (location == -1));

        return location;
    }

    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int searchInt;
        int position;

        BinarySearch binaryArrya = new BinarySearch(15);
        System.out.println(binaryArrya);

        System.out.println("please enter an integer value (-1 to quit): ");
        searchInt = input.nextInt();
        System.out.println();


        while (searchInt != -1) {
            position = binaryArrya.binarySearch(searchInt);

            if (position == -1)
                System.out.println("The integer " + searchInt + " was not found\n");
            else
                System.out.println("The integer " + searchInt + " was found in position " + position + ".\n");


            System.out.println("please enter an integer value (-1 to quit): ");
            searchInt = input.nextInt();
        }
    }
}

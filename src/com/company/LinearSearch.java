package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
    private int[] data;
    private Random generator;

    public LinearSearch(int size) {
        data = new int[size];
        generator = new Random();

        // fill array with random integers in range 10-99
        for (int i = 0; i < size; i++) {
            data[i] = 10 + generator.nextInt(90);
        }
    }

    public int linearSearch(int searchKey) {
        // loop through the array sequentially
        for (int index = 0; index < data.length; index++) {
            if (data[index] == searchKey) {
                return index;
            }
        }
        return - 1;
    }

    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int position;
        int searchInt;

        LinearSearch searchArray = new LinearSearch(10);
        System.out.println(searchArray);

        System.out.println("Please enter an integer value (-1 to quit): ");
        searchInt = input.nextInt();

        while (searchInt != -1) {
            position = searchArray.linearSearch(searchInt);

            if (position == -1)
                System.out.println("The integer " + searchInt + " was not found.\n");
            else {
                System.out.println("The integer " + searchInt + " was found in position " + position + ".\n");
            }

            System.out.println("Please enter an integer value (-1 to quit): ");
            searchInt = input.nextInt();
        }
    }
}

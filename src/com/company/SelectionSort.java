package com.company;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    private int[] data;
    private Random generator;

    public SelectionSort(int size) {
        data = new int[size];
        generator = new Random();

        for (int i = 0; i < size; i++) {
            data[i] = 10 + generator.nextInt(90);
        }
    }

    private void sort() {
        int smallest;

        for (int i = 0; i < data.length; i++) {
            smallest = i;
            for (int index = i+1; index < data.length; index++) {
                if (data[index] < data[smallest]) {
                    smallest = index;
                }
            }
            swap(i, smallest);
        }
    }

    private void swap(int first, int second) {
        int temp = data[first];
        data[first] = data[second];
        data[second] = temp;
    }

    public static void main(String[] args) {
        SelectionSort sortArray = new SelectionSort(10);

        System.out.println("Unsorted array: " + sortArray);

        sortArray.sort();

        System.out.println("Sorted Array: " + sortArray);
    }

    public String toString() {
        return Arrays.toString(data);
    }
}

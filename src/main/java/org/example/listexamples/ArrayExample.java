package org.example.listexamples;

public class ArrayExample {

    public static void main(String[] args) {
        // int arr[] = new int[2];
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;

        for (int i : arr) {
            System.out.println(i);
        }
        arr[2] = 3;
    }
}
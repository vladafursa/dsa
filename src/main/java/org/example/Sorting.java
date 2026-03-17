package org.example;

public class Sorting {
    /*
    * O(n^2) - worst case scenario
    * O(n) - when nearly sorted
    * O(1) - space complexity
    * */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        while(n > 1) {
            boolean swapped = false;
            for(int i = 0; i < n-1; i++) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
            n--;
        }
    }
}

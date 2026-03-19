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


    /*
     * O(n^2) - worst case scenario, actually O(N^2 /2)
     * O(1) - space complexity
     * */

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[index]>arr[j]){
                    index = j;
                }
            }
            if(index!=i){
                int temp = arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
        }
    }

    /*
     * O(n^2) - worst case scenario, actually O(N^2 + 2N - 2)
     * O(n) - best case scenario
     * O(n^2/2) - average case
     * */
    public static void insertionSort(int[] arr){
        for (int i=1;i<arr.length;i++){
            int temp = arr[i];
            int position = i-1;
            while(position>=0){
                if(temp<arr[position]){
                    arr[position+1]= arr[position];
                    position= position-1;
                }
                else{
                    break;
                }
            }
            arr[position+1]=temp;
        }
    }
}

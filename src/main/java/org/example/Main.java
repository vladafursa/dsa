package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr ={2,6,1,9,4};
        Sorting.bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
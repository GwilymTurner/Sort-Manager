package com.sparta.gwilymt.mergeSort;

import com.sparta.gwilymt.PrintArray;
import com.sparta.gwilymt.Sort;

public class MergeSort implements Sort {

    public int[] mergeSort(int[] array) {
        Combine combine = new Combine();
        if (array.length == 1) {
            //Do nothing
        } else {
            int half = array.length / 2;
            int[] returnArray = new int[array.length];
            int arrayPos = 0;
            int[] halfArrayA = new int[half];
            int[] halfArrayB = new int[array.length - half];
            for (int i = 0; i < halfArrayA.length; i++) {
                halfArrayA[i] = array[arrayPos];
                arrayPos++;
            }
            for (int i = 0; i < halfArrayB.length; i++) {
                halfArrayB[i] = array[arrayPos];
                arrayPos++;
            }
            halfArrayA = mergeSort(halfArrayA);
            halfArrayB = mergeSort(halfArrayB);
            returnArray = combine.CombineArray(halfArrayA, halfArrayB);
            return returnArray;
        }
        return array;
    }

    @Override
    public void runSort(int[] array) {
        int[] sorted = mergeSort(array);
        PrintArray.printArray(sorted);
    }
}

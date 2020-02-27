package com.sparta.gwilymt.bubbleSort;

import com.sparta.gwilymt.PrintArray;
import com.sparta.gwilymt.Sort;

public class BubbleSort implements Sort {
    public int[] bubbleSort(int[] array){
        int swapSpare;
        for (int i = 0; i < array.length-1; i++){
            if (array[i] > array[i+1]){
                swapSpare = array[i];
                array[i] = array[i+1];
                array[i+1] = swapSpare;
                bubbleSort(array);
            }
        }
        return array;
    }

    @Override
    public void runSort(int[] array) {
        int[] sorted = bubbleSort(array);
        PrintArray.printArray(sorted);
    }
}

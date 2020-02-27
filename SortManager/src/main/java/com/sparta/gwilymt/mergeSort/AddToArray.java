package com.sparta.gwilymt.mergeSort;

public class AddToArray {
    public int addToArray(int[]returnArray, int returnPos, int pos, int value){
        returnArray[returnPos] = value;
        return pos+1;
    }
    public int checkEnd(int[] array, int pos, int value) {
        if (pos < array.length) {
            value = array[pos];
        }
        return value;
    }
}
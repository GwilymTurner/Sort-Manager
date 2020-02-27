package com.sparta.gwilymt.mergeSort;

public class Combine {
    public int[] CombineArray(int[] arrayA, int[] arrayB) {
        AddToArray addToArray = new AddToArray();
        int[] returnArray = new int[arrayA.length + arrayB.length];
        int returnPos = 0;
        int aPos = 0;
        int aValue = arrayA[aPos];
        int bPos = 0;
        int bValue = arrayB[bPos];
        do {
            if (aPos == arrayA.length) {
                for (int loopPos = returnPos; loopPos < returnArray.length; loopPos++) {
                    bPos = addToArray.addToArray(returnArray, loopPos, bPos, bValue);
                    bValue = addToArray.checkEnd(arrayB, bPos, bValue);
                }
                break;
            } else if (bPos == arrayB.length) {
                for (int loopPos = returnPos; loopPos < returnArray.length; loopPos++) {
                    aPos = addToArray.addToArray(returnArray, loopPos, aPos, aValue);
                    aValue = addToArray.checkEnd(arrayA, aPos, aValue);
                }
                break;
            }
            if (aValue < bValue) {
                aPos = addToArray.addToArray(returnArray, returnPos, aPos, aValue);
                aValue = addToArray.checkEnd(arrayA, aPos, aValue);
                returnPos++;
            } else if (bValue < aValue) {
                bPos = addToArray.addToArray(returnArray, returnPos, bPos, bValue);
                bValue = addToArray.checkEnd(arrayB, bPos, bValue);
                returnPos++;
            } else {
                aPos = addToArray.addToArray(returnArray, returnPos, aPos, aValue);
                aValue = addToArray.checkEnd(arrayA, aPos, aValue);
                returnPos++;
                bPos = addToArray.addToArray(returnArray, returnPos, bPos, bValue);
                bValue = addToArray.checkEnd(arrayB, bPos, bValue);
                returnPos++;
            }
        } while (returnPos < returnArray.length);
        return returnArray;
    }
}
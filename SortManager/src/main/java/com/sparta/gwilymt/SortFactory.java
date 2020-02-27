package com.sparta.gwilymt;

import com.sparta.gwilymt.binaryTreeSort.BinaryTree;
import com.sparta.gwilymt.bubbleSort.BubbleSort;
import com.sparta.gwilymt.mergeSort.MergeSort;

public class SortFactory {
    public Sort getSort(String sort, int[] array){
        switch(sort.toLowerCase()){
            case "bubble":
                return new BubbleSort();

            case "merge":
                return new MergeSort();

            case "binary tree":
                return new BinaryTree(array[0]);

            default:
                return null;
        }
    }
}

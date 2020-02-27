package com.sparta.gwilymt;

public class App 
{
    public static void main( String[] args )
    {
        int[] numArray = {4, 1, 59, 12, 109, 73};
        SortFactory sortFactory = new SortFactory();
        Sort sorter;
        sorter = sortFactory.getSort("binary tree", numArray);
        sorter.runSort(numArray);
    }
}

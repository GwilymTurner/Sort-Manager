package com.sparta.gwilymt.binaryTreeSort;

public interface BinaryTreeInterface {
    Node getRootElement(); //Get first element
    void addElement(Node parent, int value); //Add element
    boolean searchTree(Node node, int value);
    void getSortedTreeAsc(Node node); //Main method to sort ascending order
    void getSortedTreeDesc(Node node);  //Main method to sort descending order
    void findValue(int value);
}
package com.sparta.gwilymt.binaryTreeSort;

public class Node {
    private Node leftChild;
    private Node rightChild;
    private int value;
    private int count; //counts number of times it has appeared in the list
    Node(int value){
        this.value = value;
        this.count = 1;
    }

    Node getLeftChild() {
        return this.leftChild;
    }
    void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }
    Node getRightChild() {
        return this.rightChild;
    }
    void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
    int getValue() {
        return this.value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    void addCount(){
        this.count++;
    }
    int getCount(){
        return this.count;
    }
}
package com.sparta.gwilymt.binaryTreeSort;

import com.sparta.gwilymt.Sort;

public class BinaryTree implements BinaryTreeInterface, Sort {
    private Node root;
    public BinaryTree(int start){
        this.root = new Node(start);
    }

    @Override
    public Node getRootElement() {
        return this.root;
    }
    @Override
    public void addElement(Node parent, int value) {
        if (value < parent.getValue()) { //if smaller than node
            if (parent.getLeftChild() != null) { //if already has left child
                addElement(parent.getLeftChild(), value); //compare with left child
            } else {
                parent.setLeftChild(new Node(value)); //else add as left child
            }
        } else if (value > parent.getValue()) { //if larger than node
            if (parent.getRightChild() != null) { //if already has right child
                addElement(parent.getRightChild(), value); //compare with right child
            } else {
                parent.setRightChild(new Node(value));//else add as right child
            }
        }
        else{
            parent.addCount(); //count as repeated value
        }
    }
    @Override
    public boolean searchTree(Node node, int value) {
        boolean found = false;
        if (node != null) {
            if (node.getValue() == value) {
                System.out.println("Value " + value + " found in tree " + node.getCount() + " time(s)");
                found = true;
                return found;
            } else  { //if not empty
                found = searchTree(node.getLeftChild(), value); //Go down left child
                if(found){
                    return found;
                }
                found = searchTree(node.getRightChild(), value);//Go down right child
                return found;
            }
        }
        return found;
    }
    @Override
    public void findValue(int value){
        if(!this.searchTree(this.getRootElement(), value)){
            System.out.println("Value " + value + " not found");
        };
    }
    @Override
    public void getSortedTreeAsc(Node node) {
        if (node != null) { //if not empty
            getSortedTreeAsc(node.getLeftChild()); //Go down left child
            System.out.print(" " + node.getValue() + "(" + node.getCount() + ") "); //Return value
            getSortedTreeAsc(node.getRightChild());//Go down right child
        }
    }
    @Override
    public void getSortedTreeDesc(Node node) {
        if (node != null) {
            getSortedTreeDesc(node.getRightChild());//Go down right child
            System.out.print(" " + node.getValue() + "(" + node.getCount() + ") ");//Return value
            getSortedTreeDesc(node.getLeftChild());//Go down left child
        }
    }

    @Override
    public void runSort(int[] array) {
        for (int i = 1; i < array.length; i++){
            this.addElement(this.getRootElement(), array[i]);
        }
        this.getSortedTreeAsc(this.getRootElement());
    }
}
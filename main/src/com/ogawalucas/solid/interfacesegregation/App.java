package com.ogawalucas.solid.interfacesegregation;

public class App {

    public static void main(String[] args) {
        var binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert();
        binarySearchTree.delete();
        binarySearchTree.traverse();

        var balancedTree = new BalancedTree();
        balancedTree.insert();
        balancedTree.delete();
        balancedTree.traverse();
        balancedTree.leftRotation();
        balancedTree.rightRotation();
    }
}

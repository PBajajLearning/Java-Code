package com.learning.BinaryTree;

class Node
{
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
public class CreateBinaryTree
{
    // Root of Binary Tree
    Node root;

    // Constructors

    CreateBinaryTree(int key)
    {
        root = new Node(key);
    }

    CreateBinaryTree()
    {
        root = null;
    }

    void PrintPreOrder (Node node)
    {
        if (node == null)
            return;
        System.out.print(node.key + "");
        PrintPreOrder(node.left);
        PrintPreOrder(node.right);
    }

    void printPreorder()
    {
        PrintPreOrder(root);
    }

    void PrintPostOrder (Node node)
    {
        if (node == null)
            return;

        PrintPostOrder(node.left);
        PrintPostOrder(node.right);
        System.out.print(node.key + "  ");
    }

    void printPostorder()
    {
        PrintPostOrder(root);
    }

    void PrintInOrder (Node node)
    {
        if (node == null)
            return;

        PrintInOrder(node.left);
        System.out.print(node.key + " ");
        PrintInOrder(node.right);

    }

    void printInorder()
    {
        PrintInOrder(root);
    }

    public static void main(String[] args)
    {
        CreateBinaryTree tree = new CreateBinaryTree();

        /*Add Nodes*/
        tree.add(1);
        tree.add(12);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(0);
        tree.printPreorder();
        tree.printPostorder();
        tree.printInorder();
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.key) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.key) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }
}

package kunal.Main;

import static java.lang.Math.max;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    private Node root;

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder();
    }

    private void printLevelOrder() {
        int height = height(root);
        for (int i = 1; i <= height; i++)
            printGivenLevel(root, i);
    }

    private int height(Node root) {
        if (root == null) {
            return 0;
        }

        return max(height(root.left), height(root.right)) + 1;
    }

    private void printGivenLevel(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.data + " ");
        }

        printGivenLevel(root.left, level - 1);
        printGivenLevel(root.right, level - 1);
    }
} 

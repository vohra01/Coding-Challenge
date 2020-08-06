package kunal.Main;// Java program to print top
// view of binary tree 

import java.util.Map;
import java.util.TreeMap;

class printTreeTopView {

    // map to store the pair of node value and
// its level with respect to the vertical
// distance from root.
    static TreeMap<Integer,
            pair> treeMap = new TreeMap<>();

    // function to create a new node
    static Node newNode(int key) {
        Node node = new Node();
        node.left = node.right = null;
        node.data = key;
        return node;
    }

    // function to fill the map
    static void fillMap(Node root, int d, int l) {
        if (root == null) return;

        if (treeMap.get(d) == null) {
            treeMap.put(d, new pair(root.data, l));
        } else if (treeMap.get(d).second > l) {
            treeMap.put(d, new pair(root.data, l));
        }

        fillMap(root.left, d - 1, l + 1);
        fillMap(root.right, d + 1, l + 1);
    }

    // function should print the topView of
// the binary tree
    static void topView(Node root) {
        fillMap(root, 0, 0);

        for (Map.Entry<Integer,
                pair> entry : treeMap.entrySet()) {
            System.out.print(entry.getValue().first + " ");
        }
    }

    // Driver Code
    public static void main(String args[]) {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.right = newNode(4);
        root.left.right.right = newNode(5);
        root.left.right.right.right = newNode(6);
        System.out.println("Following are nodes in" +
                " top view of Binary Tree");
        topView(root);
    }

    // Structure of binary tree
    static class Node {
        Node left;
        Node right;
        int data;
    }

    static class pair {
        int first, second;

        pair() {
        }

        pair(int i, int j) {
            first = i;
            second = j;
        }
    }
}

// This code is contributed by Arnab Kundu 

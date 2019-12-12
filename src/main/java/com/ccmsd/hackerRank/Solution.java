package com.ccmsd.hackerRank;

import java.io.*;
import java.util.*;


public class Solution {

    static int[][] swapNodes(int[][] indexes, int[] queries) {
        Node root = new Node(1);
        addNode(root, indexes, 0);
        List<Integer> ls = new ArrayList<Integer>();
        printInorder(root, ls);
        System.out.println(ls);
        // swap(root, 0, 1);
        return indexes;
    }

    private static void addNodea(Node root, int[][] indexes, int j) {
        Node c = root;
        for (int i = 0; i < indexes.length; i++) {
            while (c != null) {
                // addNode(root, 0);
            }
        }

    }

    private static void addNode(Node root, int[][] indexes, int i) {
        if (root == null || root.value == -1 || i >= indexes.length) {
            return;
        }
        Node left = null, right = null;
        // if (indexes[i][0] >= 0) {
        System.out.println(root.value + "->left->" + indexes[i][0]);
        left = new Node(indexes[i][0]);
        root.addLeft(left);
        // }
        // if (indexes[i][1] >= 0) {
        System.out.println(root.value + "->right->" + indexes[i][1]);
        right = new Node(indexes[i][1]);
        root.addRight(right);
        // }
        if (left != null) {
            i++;
            addNode(root.left, indexes, i);
        }
        if (right != null) {
            i++;
            addNode(root.right, indexes, i);
        }
    }

    public static void main(String[] args) throws IOException {

        int[][] ind = new int[5][2];
        ind[0][0] = 2;
        ind[0][1] = 3;
        ind[1][0] = -1;
        ind[1][1] = 4;
        ind[2][0] = -1;
        ind[2][1] = 5;
        ind[3][0] = -1;
        ind[3][1] = -1;
        ind[4][0] = -1;
        ind[4][1] = -1;
        int[] q = new int[10];
        swapNodes(ind, q);

    }

    private static void swap(Node root, int d, int h) {
        if (root == null) {
            return;
        }
        if (d + 1 == h) {
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
            return;
        }
        swap(root.left, d + 1, h);
        swap(root.right, d + 1, h);

    }

    private static void printInorder(Node root, List<Integer> ls) {

        if (root == null) {
            return;
        }
        printInorder(root.left, ls);
        // System.out.print(root.value + " ");
        ls.add(root.value);
        printInorder(root.right, ls);
    }
}

class Node {

    int value;
    Node left;
    Node right;

    Node(int val) {
        value = val;
        left = null;
        right = null;
    }

    Node addLeft(Node n) {
        left = n;
        return left;
    }

    Node addRight(Node n) {
        right = n;
        return right;
    }

}

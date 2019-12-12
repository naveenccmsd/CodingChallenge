package com.ccmsd.hackerRank;

public class ArrayManipulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long[] root = new long[n + 2];
        for (int i = 0; i < queries.length; i++) {
            root[queries[i][0]] += queries[i][2];
            root[queries[i][1] + 1] -= queries[i][2];
        }
        long max = 0;
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += root[i];
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String[] args) {

        int[][] queries = new int[4][3];
        queries[0][0] = 2;
        queries[0][1] = 6;
        queries[0][2] = 8;
        queries[1][0] = 3;
        queries[1][1] = 5;
        queries[1][2] = 7;
        queries[2][0] = 1;
        queries[2][1] = 8;
        queries[2][2] = 1;
        queries[3][0] = 5;
        queries[3][1] = 9;
        queries[3][2] = 15;
        System.out.println(arrayManipulation(10, queries));
    }
}

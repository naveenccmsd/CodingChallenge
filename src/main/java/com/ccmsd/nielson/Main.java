package com.ccmsd.nielson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;


public class Main {
    /**
     * Programming challenge description: You are given an n*n matrix of integers. You can move only right and down.
     * Calculate the minimal path sum from the top left to the bottom right Input:
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        if ((line = in.readLine()) != null) {
            int length = Integer.parseInt(line);
            int[][] intArray = new int[length][length];
            int j = 0;
            int k = length;
            while ((line = in.readLine()) != null) {
                String[] ipArr = line.split(",");
                if (ipArr.length > 0) {
                    for (int i = 0; i < ipArr.length; i++) {
                        intArray[j][i] = Integer.parseInt(ipArr[i]);
                    }
                }
                j++;
                if (k <= 1) {
                    break;
                }
                k--;
            }
            System.out.println(findMinimumPath(intArray));
        }
    }

    static void toString(int[][] intArray) {
        System.out.println();
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(Arrays.toString(intArray[i]));
        }
    }

    private static int findMinimumPath(int[][] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                int left = Integer.MAX_VALUE;
                int up = Integer.MAX_VALUE;
                if (i > 0) {
                    left = intArray[i - 1][j];
                }
                if (j > 0) {
                    up = intArray[i][j - 1];
                }
                int minDist = (left < up) ? left : up;
                intArray[i][j] += minDist;
            }
        }
        return intArray[intArray.length - 1][intArray.length - 1];
    }
}

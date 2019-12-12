package com.ccmsd.hackerRank;

import java.io.*;


public class JumpingontheClouds {
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int move = -1;
        for (int i = 0; i < c.length; i++) {
            if (i + 2 < c.length && c[i + 2] == 0) {
                i = i + 1;
            }
            move++;
        }
        return move;

    }

    public static void main(String[] args) throws IOException {

        int[] c = { 0, 0, 1, 0, 0, 1, 0 };
        int result = jumpingOnClouds(c);
        System.out.println(result);
    }
}

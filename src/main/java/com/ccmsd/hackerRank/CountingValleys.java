package com.ccmsd.hackerRank;

import java.io.*;
import java.util.*;


public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        if (n < 2 || n > Math.pow(10, 6) || s == null || s.equals("")) {
            return 0;
        }
        int res = 0;
        int level = 0;
        boolean atSeaLevel = false;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'U') {
                level++;
            } else if (c == 'D') {
                level--;
            }
            if (level < 0) {
                atSeaLevel = true;
            }
            if (level == 0 && atSeaLevel) {
                res++;
                atSeaLevel = false;
            }
        }
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(String.valueOf(result));

        scanner.close();
    }
}

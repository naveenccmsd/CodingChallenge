package com.ccmsd.nielson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


public class Main1 {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            String[] ipArr = line.split(",");
            if (ipArr.length > 0) {
                int[] intArray = new int[ipArr.length];
                for (int i = 0; i < ipArr.length; i++) {
                    intArray[i] = Integer.parseInt(ipArr[i]);
                }
                System.out.println(findLargestDifference(intArray));
            }

        }
    }

    private static int findLargestDifference(int[] intArray) {
        int min = intArray[0], max = intArray[0];

        for (int i = 0; i < intArray.length; i++) {
            if (min > intArray[i]) {
                min = intArray[i];
            }
            if (max < intArray[i]) {
                max = intArray[i];
            }
        }
        return max - min;
    }
}

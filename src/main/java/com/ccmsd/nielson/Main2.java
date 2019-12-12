package com.ccmsd.nielson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


public class Main2 {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            String[] ipArr = line.split(" ");
            if (ipArr.length > 1) {
                int[] intArray = new int[Integer.parseInt(ipArr[0])];
                for (int i = 0; i < intArray.length; i++) {
                    intArray[i] = Integer.parseInt(ipArr[i + 1]);
                }
                String result = isJolly(intArray) ? "Jolly" : "Not Jolly";
                System.out.println(result);
            }
        }
    }

    private static boolean isJolly(int[] intArray) {
        if (intArray.length < 2) {
            return false;
        }
        if (intArray.length == 2) {
            return true;
        }

        int difference = Math.abs(intArray[1] - intArray[0]);
        for (int i = 2; i < intArray.length; i++) {
            int new_difference = Math.abs(intArray[i - 1] - intArray[i]);
            if ((difference - new_difference) != 1) {
                return false;
            }
            difference = new_difference;
        }
        return true;
    }
}

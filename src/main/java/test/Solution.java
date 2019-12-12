package test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {

    // Complete the maximizeRatings function below.
    static int maximizeRatings(int[] ratings) {
        int maxRating = 0;
        int[] sortArrays = Arrays.stream(ratings).filter(s -> s < 0).sorted().toArray();
//        Arrays.sort(sortArrays);
        for (int j = 0; j < sortArrays.length; j++) {
            for (int i = 0; i < ratings.length; i++) {
                if (ratings[i] == sortArrays[j] && ratings[i] < 0) {
                    boolean check1 = false, check2 = false;
                    if (i == 0) {
                        check1 = true;
                    } else if (ratings[i - 1] != 0) {
                        check1 = true;
                    }
                    if (i >= ratings.length - 1) {
                        check2 = true;
                    } else if (ratings[i + 1] != 0) {
                        check2 = true;
                    }
                    if (check1 && check2) {
                        ratings[i] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < ratings.length; i++) {
            maxRating += ratings[i];
        }
        System.out.println(Arrays.toString(ratings));
        return maxRating;
    }

    public static void main(String[] args) throws IOException {

        int ratings[] = { 9, -1, -3, 4, 5 };
        int res = maximizeRatings(ratings);
        System.out.println(res);
    }
}

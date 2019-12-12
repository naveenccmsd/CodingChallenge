package com.ccmsd.hackerRank;

import java.io.IOException;


public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int countPerString = repeatedPerString(s, 'a');
        long completeStrings = ((n / s.length()) * countPerString);
        int inCompleteStrings = repeatedPerString(s.substring(0, (int) (n % s.length())), 'a');
        return completeStrings + inCompleteStrings;

    }

    static int repeatedPerString(String s, char a) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(RepeatedString.repeatedString("a", new Long("1000000000000")));
    }
}

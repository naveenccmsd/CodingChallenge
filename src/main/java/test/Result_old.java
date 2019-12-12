package test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result_old {

    /*
     * Complete the 'sumOfOccurences' function below. The function is expected to return a LONG_INTEGER. The function
     * accepts INTEGER_ARRAY digits as parameter.
     */

    public static long sumOfOccurences(List<Integer> digits) {
        long sum = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer i : digits) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Integer key : map.keySet()) {
            sum += Math.pow(key, map.get(key));
        }
        return sum;

    }

    public static void main(String args[]) {
        Integer[] i = { 5, 1, 5, 2, 2, 1, 3, 2 };
        List<Integer> digits = Arrays.asList(i);
        sumOfOccurences(digits);
    }

}

package com.ccmsd.hackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import util.FileUtil;


public class CountTriplets {

    static long countTriplets(List<Long> arr, long r) {
        HashMap<Long, Integer> map = new HashMap<>();
        for (Long arr1 : arr) {
            int value = 0;
            if (map.get(arr1) != null) {
                value = map.get(arr1);
            }
            map.put(arr1, value + 1);
        }
        System.out.println(map);
        int count = 0;
        for (Long key : map.keySet()) {
            try {
                long s = 0;
                if (r == 1) {
                    // for (int i = map.get(key) - 2; i > 0; i--) {
                    // s += i;
                    // }

                    int t_count = (map.get(key) - 3);

                    s += factorial(t_count);
                } else {
                    s = map.get(key) * map.get(key * r) * map.get(key * r * r);
                }
                count += s;
            } catch (Exception e) {
                // Do Nothing
            }
        }
        return count;
    }
    
    private static long countTripletsJava(List<Long> arr, long r) {
        Map<Long, Long> potential = new HashMap<>();
        Map<Long, Long> counter = new HashMap<>();
        long count = 0;
        for (int i = 0; i < arr.size(); i++) {
            long a = arr.get(i);
            long key = a / r;
            
            if (counter.containsKey(key) && a % r == 0) {
                count += counter.get(key);
            }
            
            if (potential.containsKey(key) && a % r == 0) {
                long c = potential.get(key);
                counter.put(a, counter.getOrDefault(a, 0L) + c);
            }
            
            potential.put(a, potential.getOrDefault(a, 0L) + 1); // Every number can be the start of a triplet.
        }
        return count;
    }

    static long factorial(long n) {
        if (n == 0)
            return 1;
        else
            return (n + factorial(n - 1));
    }

    public static void main(String args[]) {

        List<String> ipf = FileUtil.readLines("src/test/resources/CountTripletsTest1.csv");
        String[] ips = ipf.get(0).split(" ");
        long[] ar = Arrays.stream(ips).mapToLong(num -> Long.parseLong(num)).toArray();
        List<Long> arr = Arrays.stream(ar).boxed().collect(Collectors.toList());
        System.out.println(countTripletsJava(arr, 1));
    }
}

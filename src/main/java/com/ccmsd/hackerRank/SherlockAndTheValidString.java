package com.ccmsd.hackerRank;

import java.util.HashMap;


public class SherlockAndTheValidString {

    // Complete the isValid function below.
    static String isValid(String s) {
        int[] ab = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int ascii = (int) s.charAt(i);
            ab[ascii - 97] += 1;
        }
        int limit = 1;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < 25; i++) {
            if (ab[i] > 0) {
                count++;
                sum += ab[i];
            }
        }

        int avg = (int) Math.rint(sum / count);
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < 25; i++) {
            if (ab[i] != 0) {
                int val = 0;
                if (hm.get(ab[i]) != null) {
                    val = hm.get(ab[i]);
                }
                hm.put(ab[i], val + 1);
            }
        }
        if (hm.size() > 2) {
            return "NO";
        }
        int max = 0;
        for (int v : hm.keySet()) {
            if (max < hm.get(v)) {
                max = hm.get(v);
                avg = v;
            }
        }
        for (int i = 0; i < 25; i++) {
            if (ab[i] != 0 && ab[i] != avg) {
                if (limit <= 0) {
                    return "NO";
                }
                if (ab[i] == 1 || Math.abs(ab[i] - avg) <= limit) {
                    limit = limit - avg;
                } else {
                    return "NO";
                }
            }
        }
        return "YES";

    }

    public static void main(String args[]) {

        // System.out.println(Math.ceil(1.56));
        // System.out.println(Math.floor(1.56));
        // System.out.println(Math.rint(1.56));
        // System.out.println(Math.round(1.56));
        //
        //
        // System.out.println(Math.ceil(1.44));
        // System.out.println(Math.floor(1.44));
        // System.out.println(Math.rint(1.44));
        // System.out.println(Math.round(1.44));

        System.out.println(isValid("aaaabbcc"));
    }
}

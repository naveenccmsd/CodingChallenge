package com.ccmsd.hackerRank;

import java.util.HashMap;


public class RansomNote {

    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : magazine) {
            int value = 0;
            if (map.get(str) != null) {
                value = map.get(str);
            }
            map.put(str, value + 1);
        }
        System.out.println(map);

        boolean res = true;
        for (String str : note) {
            Integer s = map.get(str);
            if (s == null || s == 0) {
                res = false;
                break;
            }
            map.put(str, s - 1);
        }
        System.out.println(map);
        if (res) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }

    }

    public static void main(String args[]) {
        checkMagazine("give me one grand today night".split(" "), "give one grand today give".split(" "));
    }
}

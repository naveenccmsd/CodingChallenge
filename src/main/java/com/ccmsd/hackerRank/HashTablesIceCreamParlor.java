package com.ccmsd.hackerRank;

import java.util.HashMap;
import java.util.Map;


public class HashTablesIceCreamParlor {

    public static void main(String args[]) {

        int[] arr = { 1, 5, 3, 4, 2 };
        System.out.println(whatFlavors(arr, 2));
    }

    static int whatFlavors(int[] cost, int money) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < cost.length; i++) {
            map.put(cost[i], map.getOrDefault(cost[i], 0) + 1);
        }
        System.out.println(map);
        int count = 0;
        for (Integer i : map.keySet()) {
            System.out.println(i + "-->" + (i - money) + "-->" + count);
            if (map.get(i - money) != null && map.get(i - money) > 0) {
                count++;
//                map.put(i - money, map.get(i - money) - 1);
//                map.put(i, map.get(i) - 1);

            }
        }
        return count;
    }
}

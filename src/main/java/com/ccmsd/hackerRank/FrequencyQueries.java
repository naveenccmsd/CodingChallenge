package com.ccmsd.hackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import util.FileUtil;


public class FrequencyQueries {

    static List<Integer> freqQuery(List<List<Integer>> queries) {

        List<Integer> op = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (List<Integer> query : queries) {
            if (query.get(0) == 1) {
                map.put(query.get(1), map.getOrDefault(query.get(1), 0) + 1);
            } else if (query.get(0) == 2) {
                map.put(query.get(1), map.getOrDefault(query.get(1), 1) - 1);
            } else if (query.get(0) == 3) {
                int output = 0;
                for (Integer keys : map.values()) {
                    if (query.get(1) == keys) {
                        output = 1;
                        break;
                    }
                }
                op.add(output);
            }
        }
        return op;

    }

    public static void main(String args[]) {
        List<String> ipf = FileUtil.readLines("src/test/resources/FrequencyQueriesTest3.txt");

        List<List<Integer>> queriess = new ArrayList<>();
        for (String ipss : ipf) {
            List<Integer> qss = new ArrayList<>();
            String[] ipsss = ipss.split(" ");
            for (String ipssss : ipsss) {
                qss.add(Integer.parseInt(ipssss));
            }
            queriess.add(qss);
        }
        System.out.println(freqQuery(queriess));
    }

    static List<Integer> freqQueryNew(int[][] queries) {
        List<Integer> response = new ArrayList<Integer>();
        Map<Integer, Integer> frequencies = new WeakHashMap<Integer, Integer>();

        int size = queries.length;
        int maxValue = 1;
        for (int i = 0; i < size; i++) {
            int operation = queries[i][0];
            Integer value = queries[i][1];

            if (operation == 1) {
                Integer val = frequencies.get(value);
                if (val == null)
                    frequencies.put(value, 1);
                else {
                    int newVal = val + 1;
                    maxValue = (newVal > maxValue) ? newVal : maxValue;
                    frequencies.put(value, newVal);
                }
                continue;
            } else if (operation == 2) {
                Integer val = frequencies.get(value);
                if (val != null && val > 0)
                    frequencies.put(value, val - 1);
                continue;
            } else {
                if (maxValue < value) {
                    response.add(0);
                    continue;
                }
                response.add(frequencies.containsValue(value) ? 1 : 0);
            }
        }

        return response;

    }
}

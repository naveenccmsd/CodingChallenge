package test;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class UniqueName {
    public static String firstUniqueName(String[] names) {
        HashMap<String, Integer> map = new HashMap<>(names.length);
        for (String s : names) {
            Integer count = map.getOrDefault(s, 0);
            map.put(s, count + 1);
        }
        for (String s : names) {
            if (map.get(s) == 1) {
                return s;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueName(new String[] { "Abbi", "Adeline", "Abbi", "Adalia" }));
    }
}

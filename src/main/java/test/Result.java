package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


class Result {

    /*
     * Complete the 'writeIn' function below. The function is expected to return a STRING. The function accepts
     * STRING_ARRAY ballot as parameter.
     */

    public static String writeIn(List<String> ballot) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String b : ballot) {
            map.put(b, map.getOrDefault(b, 0) + 1);
        }
        System.out.println(map);
        int max = 0;
        String maxVal = "";
        for (Entry<String, Integer> s : map.entrySet()) {
            if (s.getValue() == max) {
                if (s.getKey().compareTo(maxVal) >= 0) {
                    maxVal = s.getKey();
                }
            } else if (s.getValue() > max) {
                max = s.getValue();
                maxVal = s.getKey();
            }
        }
        return maxVal;

    }

    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("Alex");
        list.add("Michael");
        list.add("Harry");
        list.add("Dave");
        list.add("Michael");
        list.add("Victor");
        list.add("Harry");
        list.add("Alex");
        list.add("Mary");
        list.add("Mary");

        System.out.println(writeIn(list));
    }

}

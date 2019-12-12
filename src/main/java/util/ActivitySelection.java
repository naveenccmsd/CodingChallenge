package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;


class ActivitySelection {
    public static int countMeetings(List<Integer> arrival, List<Integer> departure) {
        System.out.println(arrival);
        System.out.println(departure);
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        List<Integer> blocked = new ArrayList<>();
        for (int i = 0; i < arrival.size(); i++) {
            int index = departure.get(i) - arrival.get(i);
            List<Integer> l = map.getOrDefault(index, new ArrayList<Integer>());
            l.add(i);
            map.put(index, l);
        }
        System.out.println(map);
        for (Entry<Integer, List<Integer>> e : map.entrySet()) {
            List<Integer> indexs = e.getValue();
            for (int index : indexs) {
                for (int i = arrival.get(index); i <= departure.get(index); i++) {
                    if (blocked.indexOf(i) < 0) {
                        blocked.add(i);
                        break;
                    }
                }
            }
        }
        System.out.println(blocked);
        return 0;

    }

    public static void main(String args[]) {
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(3);

        List<Integer> dep = new ArrayList<Integer>();
        dep.add(2);
        dep.add(2);
        dep.add(3);
        dep.add(4);
        dep.add(4);
        countMeetings(arr, dep);
    }

}

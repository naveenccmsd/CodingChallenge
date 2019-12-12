package com.ccmsd.techgig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class CricketCountrySelection {

    public static void main(String args[]) {

        Map<Integer, SizedStack<String>> pool = new HashMap<Integer, SizedStack<String>>();
        fillpool(pool);
        List<Player> players = Player.addPlayers();
        removePoolOnPlayerCount(pool);
        System.out.println(pool.size());
        pool.values().stream().forEach(System.out::println);
        
    }

    private static void removePoolOnPlayerCount(Map<Integer, SizedStack<String>> pool) {
        Map<Integer, SizedStack<String>> newPool = new HashMap<>();
        for (Entry<Integer, SizedStack<String>> e : pool.entrySet()) {
            SizedStack<String> stack = e.getValue();
            if (stack.bt <= Player.bt && stack.bw <= Player.bw && stack.wk <= Player.wk && stack.al <= Player.al) {
                newPool.put(e.getKey(), e.getValue());
            }
        }
        pool.clear();
        pool.putAll(newPool);
    }

    private static void allPosiblities(List<Player> players) {
        SizedStack<Player> stack = new SizedStack<Player>(11);
        for (Player p : players) {
            stack.add(p);
        }

    }

    private static void fillpool(Map<Integer, SizedStack<String>> pool) {
        fillpoolBatsman(pool, 3, 6, "BT");

    }

    private static void fillpoolBatsman(Map<Integer, SizedStack<String>> pool, int min, int max, String type) {
        int j = 0;
        for (int i = min; i <= max; i++, j++) {
            SizedStack<String> stack;
            if (j < pool.size()) {
                stack = pool.get(j);
            } else {
                stack = new SizedStack<>(11);
            }
            int k = 0;
            while (k < i) {
                if (stack.isFull()) {
                    break;
                }
                stack.push(type);
                k++;
            }
            pool.put(j, stack);
        }
        fillpoolOthers(pool, 3, 6, "BW");
        fillpoolOthers(pool, 1, 4, "WK");
        fillpoolOthers(pool, 1, 4, "AL");
        removeNotFull(pool);
    }

    private static synchronized void fillpoolOthers(Map<Integer, SizedStack<String>> pool, int min, int max,
            String type) {
        removeIfStachNotHasMinPlayer(pool, min);
        int j = 0;
        Map<Integer, SizedStack<String>> tempPool = new HashMap<>();
        for (Integer key : pool.keySet()) {
            SizedStack<String> stack = pool.get(key);
            for (int i = min; i <= max; i++) {
                SizedStack<String> newStack = new SizedStack<>(11);
                newStack.addAll(stack);
                int k = 0;
                while (k < i) {
                    if (newStack.isFull()) {
                        break;
                    }
                    newStack.push(type);
                    k++;
                }
                tempPool.put(j, newStack);
                j++;
            }
        }
        pool.putAll(tempPool);
    }

    private static void removeIfStachNotHasMinPlayer(Map<Integer, SizedStack<String>> pool, int min) {
        Map<Integer, SizedStack<String>> newPool = new HashMap<>();
        for (Entry<Integer, SizedStack<String>> e : pool.entrySet()) {
            if (e.getValue().size() + min <= e.getValue().maxSize) {
                newPool.put(e.getKey(), e.getValue());
            }
        }
        pool.clear();
        pool.putAll(newPool);
    }

    private static void removeNotFull(Map<Integer, SizedStack<String>> pool) {
        Map<Integer, SizedStack<String>> newPool = new HashMap<>();
        for (Entry<Integer, SizedStack<String>> e : pool.entrySet()) {
            if (e.getValue().isFull()) {
                newPool.put(e.getKey(), e.getValue());
            }
        }
        pool.clear();
        pool.putAll(newPool);
    }
}

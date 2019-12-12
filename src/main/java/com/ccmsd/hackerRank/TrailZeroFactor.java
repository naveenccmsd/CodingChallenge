package com.ccmsd.hackerRank;

public class TrailZeroFactor {

    public static void main(String args[]) {
        int num = 123456;
        long start = System.currentTimeMillis();
        int count = getTrailing0InFactorial_Normal(num);
        long end = System.currentTimeMillis();
        System.out.println(count + "-" + (start - end));

    }

    private static int getTrailing0InFactorial_Normal(int num) {
        int count = 0;
        for (int i = 5; (num / i) > 0; i = i * 5) {
            count = count + (num/i);
        }
        return count;
    }
}

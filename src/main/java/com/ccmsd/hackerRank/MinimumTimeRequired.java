package com.ccmsd.hackerRank;


public class MinimumTimeRequired {

    static long minTime(long[] machines, long goal) {

//        Arrays.sort(machines);
        long minday = (goal / machines.length) * machines[0];
        long maxday = (goal / machines.length) * machines[machines.length - 1];
//        System.out.println(minday + "<-->" + maxday);

        long day = 0;
        while (minday < maxday) {
            day = (maxday + minday) / 2;
            long sum = 0;
            for (long m : machines) {
                sum += (day / m);
            }
            if (sum >= goal) {
                maxday = day;
            } else {
                minday = day + 1;
            }
        }
        return minday;

    }

    public static void main(String[] args) {

        long[] machines = { 4, 5, 6 };
        System.out.println(minTime(machines, 12));
    }
}

package com.ccmsd.hackerRank;

import java.util.TreeSet;


public class MaximumSubarraySum {

    static long maximumSum(long[] a, long m) {

        long[] modSum = new long[a.length];
        TreeSet<Long> ts = new TreeSet<>();
        long total = 0;
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
            total = ((total + a[i]) % m);
            modSum[i] = total;
            if (total > ans) {
                ans = total;
            }
        }
        for (int i = 0; i < modSum.length; i++) {
            ts.add(modSum[i]);
            Long least = ts.higher(modSum[i]);
            if (least != null) {
                if ((m - (least - modSum[i])) > ans)
                    ans = (m - (least - modSum[i]));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        long[] a = { 846930887, 1681692778, 1714636916, 1957747794, 424238336, 719885387, 1649760493, 596516650,
                1189641422, 1025202363, 1350490028, 783368691, 1102520060, 2044897764, 1967513927, 1365180541,
                1540383427, 304089173, 1303455737, 35005212, 521595369, 294702568, 1726956430, 336465783, 861021531,
                278722863, 233665124, 2145174068, 468703136, 1101513930, 1801979803, 1315634023, 635723059,
                1369133070,
                1125898168, 1059961394, 2089018457, 628175012, 1656478043, 1131176230, 1653377374, 859484422,
                1914544920, 608413785, 756898538, 1734575199, 1973594325, 149798316,
                2038664371, 1129566414 };
        System.out.println(maximumSum(a, 1804289384));
    }
}

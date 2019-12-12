package com.ccmsd.hackerRank;


public class NthPrime {

    public static void main(String args[]) {

        int prime = nthPrime(5);
        System.out.println(prime);
    }

    private static int nthPrime(int n) {
        if (n < 2)
            return 2;
        if (n == 2)
            return 3;
        if (n == 3)
            return 5;
        int limit = (int) (n * (Math.log(n) + Math.log(Math.log(n))));
        limit = limit + 3;
//        System.out.println(limit);
        int breakPoint = (int) Math.sqrt(limit) + 1;
//        System.out.println(breakPoint);
        int count = 0;
        boolean[] sieves = new boolean[limit];
        for (int i = 2; i < limit; i++) {
            if (!sieves[i]) {
                ++count;
                if (i <= breakPoint) {
                    for (int j = i + i; j < limit; j = j + i) {
                        sieves[j] = true;
                    }
//                    System.out.println(Arrays.toString(sieves));
                }
            }
            if (n == count) {
                return i;
            }
        }
//        System.out.println(Arrays.toString(sieves));
//        System.out.println(count);
        return 0;
    }
}

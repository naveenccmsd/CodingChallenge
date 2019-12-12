package com.ccmsd.hackerRank;


public class NewYearChaos {

    // Complete the minimumBribes function below.
    static int minimumBribes(int[] q) {
        int count = 0;
        int[] bribe = new int[q.length + 1];
        boolean isSorted = false;
        while (isSorted != true) {
            isSorted = true;
            for (int i = 1; i < q.length; i++) {
                if (q[i - 1] > q[i]) {
                    int temp = q[i - 1];
                    q[i - 1] = q[i];
                    q[i] = temp;
                    bribe[q[i]]++;
                    count++;
                    if (bribe[q[i]] > 2) {
                        return 0;
                    }
                    isSorted = false;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] q = { 1, 2, 5, 3, 7, 8, 6, 4 };
        System.out.println(NewYearChaos.minimumBribes(q));
    }
}

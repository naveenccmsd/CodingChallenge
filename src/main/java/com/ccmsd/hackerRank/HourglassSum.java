package com.ccmsd.hackerRank;

import java.util.List;
import util.FileUtil;


public class HourglassSum {
    static int hourglassSum(int[][] arr) {

        int max = 0;
        boolean isMaxNull = true;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    int sum = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] + arr[i][j] + arr[i + 1][j - 1]
                            + arr[i + 1][j] + arr[i + 1][j + 1];
                    // if (!(arr[i - 1][j - 1] == 0 && arr[i - 1][j] == 0 && arr[i - 1][j + 1] == 0 && arr[i][j] == 0
                    // && arr[i + 1][j - 1] == 0 && arr[i + 1][j] == 0 && arr[i + 1][j + 1] == 0)) {

                    if (isMaxNull) {
                        max = sum;
                        isMaxNull = false;
                    }
                    if (max < sum) {
                        max = sum;
                    }
                    System.out.println("[" + i + "," + j + "]" + sum + "-->" + max);
                    // }
                } catch (Exception e) {
                    // Do Nothing
                }
            }
        }
        return max;
    }

    public static void main(String args[]) {
        List<String> ipf = FileUtil.readLines("src/test/resources/HourglassSumTest1.csv");

        int[][] ip = new int[ipf.size()][ipf.get(0).length()];
        for (int i = 0; i < ipf.size(); i++) {
            String[] vals = ipf.get(i).split(" ");
            for (int j = 0; j < vals.length; j++) {
                ip[i][j] = Integer.parseInt(vals[j]);
            }
        }

        System.out.println(hourglassSum(ip));

    }
}

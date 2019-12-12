package com.ccmsd.hackerRank;



public class CommonChild {

    static int commonChild(String a, String b) {
        int[][] C = new int[a.length() + 1][b.length() + 1];

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    C[i + 1][j + 1] = C[i][j] + 1;
                } else {
                    C[i + 1][j + 1] = Math.max(C[i + 1][j], C[i][j + 1]);
                }
            }
        }
        for (int i = 0; i < a.length(); i++) {
        }

        return C[a.length()][b.length()];
    }

    public static void main(String srgs[]) {

        System.out.println(commonChild("SHINCHAN", "NOHARAAA"));
    }
}

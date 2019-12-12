package com.ccmsd.hackerRank;

public class SpecialPalindromeAgain {

    static long substrCount(int n, String s) {
        long count = 0;
        for (int i = 0; i < n; i++) {
            int h = 1;
            while ((i + h) < n) {
                if (s.charAt(i) == s.charAt(i + h)) {
                    ++count;
                } else {
                    break;
                }
                ++h;
            }
            int k = 1;
            while (true) {
                if (k == 1 && (i - k) >= 0 && (i + k) < n && s.charAt(i - k) == s.charAt(i + k)
                        && s.charAt(i) != s.charAt(i - 1)
                        && s.charAt(i) != s.charAt(i + 1)) {
                    ++count;
                    ++k;
                } else if (k != 1 && (i - k) >= 0 && (i + k) < n && s.charAt(i - k) == s.charAt(i + k)
                        && s.charAt(i - k + 1) == s.charAt(i + k)) {
                    ++count;
                    ++k;
                } else
                    break;
            }
        }
        count = count + n;
        return count;
    }

    static long substrCountOld(int n, String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                boolean isPal = isPalindrome(s, i, j);
                // System.out.println("-->" + isPal);
                if (isPal) {
                    count++;
                }
            }
        }
        return count;
    }

    static boolean isPalindrome(String s, int start, int end) {

        // System.out.print(start + "-->" + end + "-->" + s.substring(start, end + 1) + "-->");
        // for (int i = start; i <= end; i++) {
        // System.out.print(s.charAt(i));
        // }
        char a = s.charAt(start);
        for (int i = start, j = end; i <= (start + end) / 2; i++, j--) {
            // System.out.print("[ " + s.charAt(i) + " != " + s.charAt(j) + ")");
            if (i == j) {
                return true;
            }
            if (s.charAt(i) != a || s.charAt(j) != a) {
                return false;
            }
        }
        return true;
    }

    public static void main(String arg[]) {

        // System.out.println(SpecialPalindromeAgain.isPalindrome("ab", 0, 1));
        System.out.println(SpecialPalindromeAgain.substrCount(7, "abcbaba"));
    }
}

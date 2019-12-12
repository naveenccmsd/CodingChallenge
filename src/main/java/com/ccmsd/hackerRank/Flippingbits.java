package com.ccmsd.hackerRank;

public class Flippingbits {

    static long flippingBits(long n) {
        StringBuilder sb = new StringBuilder(Long.toUnsignedString(n, 2));
        for (int i = 32 - sb.length(); i > 0; i--) {
            sb.insert(0, "0");
        }
        String no = sb.toString();
        System.out.println(no);
        no = no.replaceAll("0", "#");
        no = no.replaceAll("1", "0");
        no = no.replaceAll("#", "1");
        return Long.parseLong(no, 2);

    }

    public static void main(String args[]) {
        System.out.println(flippingBits(2));
    }
}

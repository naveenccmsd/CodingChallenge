package com.ccmsd.hackerRank;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import util.FileUtil;


public class SpecialPalindromeAgainTest {

    @Test
    public void Test1() {
        Assert.assertEquals(7, SpecialPalindromeAgain.substrCount(5, "asasd"));
    }

    @Test
    public void Test2() {
        List<String> ipf = FileUtil.readLines("src/test/resources/SpecialPalindromeAgainTest2.csv");
        System.out.println(ipf.get(0).length());
        Assert.assertEquals(1272919, SpecialPalindromeAgain.substrCount(ipf.get(0).length(), ipf.get(0)));
    }

    @Test
    public void Test3() {
        Assert.assertEquals(10, SpecialPalindromeAgain.substrCount(7, "abcbaba"));
    }

}

package com.ccmsd.hackerRank;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import util.FileUtil;


public class CountingValleysTest {

    @Test
    public void Test1() {
        Assert.assertEquals(0, CountingValleys.countingValleys(0, ""));
    }

    @Test
    public void Test2() {
        Assert.assertEquals(1, CountingValleys.countingValleys(8, "UDDDUDUU"));
    }

    @Test
    public void Test14() {
        List<String> ipf = FileUtil.readLines("src/test/resources/CountingValleysTest14.csv");
        Assert.assertEquals(718, CountingValleys.countingValleys(1000000,ipf.get(1)));
    }
}

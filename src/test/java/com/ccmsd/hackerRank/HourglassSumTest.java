package com.ccmsd.hackerRank;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import util.FileUtil;


public class HourglassSumTest {

    @Test
    public void Test1() {
        List<String> ipf = FileUtil.readLines("src/test/resources/HourglassSumTest1.csv");
        Assert.assertEquals(19, HourglassSum.hourglassSum(parse2DArray(ipf)));
    }

    @Test
    public void Test2() {
        List<String> ipf = FileUtil.readLines("src/test/resources/HourglassSumTest2.csv");
        Assert.assertEquals(-6, HourglassSum.hourglassSum(parse2DArray(ipf)));
    }
    @Test
    public void Test3() {
        List<String> ipf = FileUtil.readLines("src/test/resources/HourglassSumTest3.csv");
        Assert.assertEquals(0, HourglassSum.hourglassSum(parse2DArray(ipf)));
    }
    
    @Test
    public void Test4() {
        List<String> ipf = FileUtil.readLines("src/test/resources/HourglassSumTest4.csv");
        Assert.assertEquals(0, HourglassSum.hourglassSum(parse2DArray(ipf)));
    }

    public static int[][] parse2DArray(List<String> ipf) {
        int[][] ip = new int[ipf.size()][ipf.get(0).split(" ").length];
        for (int i = 0; i < ipf.size(); i++) {
            String[] vals = ipf.get(i).split(" ");
            for (int j = 0; j < vals.length; j++) {
                ip[i][j] = Integer.parseInt(vals[j]);
            }
        }
        return ip;
    }
}

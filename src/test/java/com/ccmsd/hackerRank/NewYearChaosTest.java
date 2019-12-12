package com.ccmsd.hackerRank;

import java.util.List;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import util.FileUtil;


public class NewYearChaosTest {

    static int[] q;

    @BeforeClass
    public static void before() {
        List<String> ipf = FileUtil.readLines("src/test/resources/NewYearChaosTest14.csv");
        String[] ips = ipf.get(0).split(" ");
        q = new int[ips.length];
        for (int i = 0; i < q.length; i++) {
            q[i] = Integer.parseInt(ips[i]);
        }
    }

    @Test
    public void Test1() {
        int[] q = { 1, 2, 5, 3, 7, 8, 6, 4 };
        Assert.assertEquals(7, NewYearChaos.minimumBribes(q));
    }

    @Test
    public void Test14() {
        Assert.assertEquals(96110, NewYearChaos.minimumBribes(q));
    }
}

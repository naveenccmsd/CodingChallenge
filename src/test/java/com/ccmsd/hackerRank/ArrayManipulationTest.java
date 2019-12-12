package com.ccmsd.hackerRank;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import util.FileUtil;


public class ArrayManipulationTest {

    @Test
    public void Test1() {
        List<String> ipf = FileUtil.readLines("src/test/resources/ArrayManipulationTest1.csv");
        String[] ips = ipf.get(0).split(" ");
        int[] q = new int[ips.length];
        for (int i = 0; i < q.length; i++) {
            q[i] = Integer.parseInt(ips[i]);
        }
        int[][] queries = new int[q[1]][3];
        for (int i = 0; i < queries.length; i++) {
            String[] x = ipf.get(i + 1).split(" ");
            queries[i][0] = Integer.parseInt(x[0]);
            queries[i][1] = Integer.parseInt(x[1]);
            queries[i][2] = Integer.parseInt(x[2]);
        }
        Assert.assertEquals(200, ArrayManipulation.arrayManipulation(q[0], queries));
    }

    @Test
    public void Test2() {
        List<String> ipf = FileUtil.readLines("src/test/resources/ArrayManipulationTest2.csv");
        String[] ips = ipf.get(0).split(" ");
        int[] q = new int[ips.length];
        for (int i = 0; i < q.length; i++) {
            q[i] = Integer.parseInt(ips[i]);
        }
        int[][] queries = new int[q[1]][3];
        for (int i = 0; i < queries.length; i++) {
            String[] x = ipf.get(i + 1).split(" ");
            queries[i][0] = Integer.parseInt(x[0]);
            queries[i][1] = Integer.parseInt(x[1]);
            queries[i][2] = Integer.parseInt(x[2]);
        }
        Assert.assertEquals((long) new Long("7542539201"), ArrayManipulation.arrayManipulation(q[0], queries));
    }
    @Test
    public void Test3() {
        List<String> ipf = FileUtil.readLines("src/test/resources/ArrayManipulationTest3.csv");
        String[] ips = ipf.get(0).split(" ");
        int[] q = new int[ips.length];
        for (int i = 0; i < q.length; i++) {
            q[i] = Integer.parseInt(ips[i]);
        }
        int[][] queries = new int[q[1]][3];
        for (int i = 0; i < queries.length; i++) {
            String[] x = ipf.get(i + 1).split(" ");
            queries[i][0] = Integer.parseInt(x[0]);
            queries[i][1] = Integer.parseInt(x[1]);
            queries[i][2] = Integer.parseInt(x[2]);
        }
        Assert.assertEquals((long) new Long("2497169732"), ArrayManipulation.arrayManipulation(q[0], queries));
    }
    @Test
    public void Test4() {
        List<String> ipf = FileUtil.readLines("src/test/resources/ArrayManipulationTest4.csv");
        String[] ips = ipf.get(0).split(" ");
        int[] q = new int[ips.length];
        for (int i = 0; i < q.length; i++) {
            q[i] = Integer.parseInt(ips[i]);
        }
        int[][] queries = new int[q[1]][3];
        for (int i = 0; i < queries.length; i++) {
            String[] x = ipf.get(i + 1).split(" ");
            queries[i][0] = Integer.parseInt(x[0]);
            queries[i][1] = Integer.parseInt(x[1]);
            queries[i][2] = Integer.parseInt(x[2]);
        }
        Assert.assertEquals((long) new Long("882"), ArrayManipulation.arrayManipulation(q[0], queries));
    }
}

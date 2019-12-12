package com.ccmsd.hackerRank;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import util.FileUtil;


public class CommonChildTest {

    @Test
    public void Test2() {
        List<String> ipf = FileUtil.readLines("src/test/resources/CommonChildTest2.csv");
        Assert.assertEquals(1618, CommonChild.commonChild(ipf.get(0), ipf.get(1)));
    }
}

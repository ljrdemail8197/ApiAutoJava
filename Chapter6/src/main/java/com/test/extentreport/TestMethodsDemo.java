package com.test.extentreport;

import com.google.common.annotations.VisibleForTesting;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.Assert;
public class TestMethodsDemo {
    @Test
    public void test1(){
      Assert.assertEquals(1,2);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test3(){
        Assert.assertEquals("aaa","aaa");
    }
    @Test
    public void logDemo(){
        Reporter.log("this is our log");
        throw new RuntimeException("this is run time exception");
    }
}

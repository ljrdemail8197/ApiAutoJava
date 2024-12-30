package com.course.code;

import org.testng.annotations.Test;

public class TimeOutTest {
    @Test(timeOut=3000)
    public void testSuccess(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(timeOut=3000)
    public void testFail(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

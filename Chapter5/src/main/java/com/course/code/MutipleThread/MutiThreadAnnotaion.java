package com.course.code.MutipleThread;

import org.testng.annotations.Test;

public class MutiThreadAnnotaion {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test() {
        System.out.println(1);
        System.out.println("Thread ID :"+Thread.currentThread().getId());


    }
}

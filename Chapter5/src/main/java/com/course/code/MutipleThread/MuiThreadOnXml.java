package com.course.code.MutipleThread;

import org.testng.annotations.Test;

public class MuiThreadOnXml {
    @Test
    public void test1() {

        System.out.println("Thread ID_test1 : " + Thread.currentThread().getId());
        System.out.println("\n");
    }

    @Test
    public void test2() {

        System.out.println("Thread ID_test2 : " + Thread.currentThread().getId());
        System.out.println("\n");
    }

    @Test
    public void test3() {

        System.out.println("Thread ID_test3 : " + Thread.currentThread().getId());
        System.out.println("\n");
    }
}

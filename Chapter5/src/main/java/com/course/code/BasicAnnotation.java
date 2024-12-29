package com.course.code;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("test case1");

    }

    @Test
    public void testCase2(){
        System.out.println("test case2");

    }
    @BeforeMethod
    public void beforeMetohd(){
        System.out.println("this is before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("this is after method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("this is before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("this is after class");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("this is before suit");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("this is after suit");
    }


}

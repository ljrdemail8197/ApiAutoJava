package com.course.code.suit;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {


    @BeforeSuite
public void beforeSuit(){
    System.out.println("this is before suit");
}
@AfterSuite
public void afterSuit(){
    System.out.println("this is after suit");
}

@BeforeTest
    public void beforeTest(){
    System.out.println("this is before test");
}
@AfterTest
    public void afterTest(){
    System.out.println("this is after test");
}
}

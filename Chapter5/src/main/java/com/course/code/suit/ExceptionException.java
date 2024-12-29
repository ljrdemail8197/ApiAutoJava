package com.course.code.suit;

import org.testng.annotations.Test;

public class ExceptionException {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("this is a fail test case");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("this is runtime exception");
        throw new RuntimeException();

    }

}

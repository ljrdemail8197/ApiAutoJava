package com.course.code.suit;

import jdk.jfr.Enabled;
import org.testng.annotations.Test;

public class ignoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore 1 test");
    }

    @Test(enabled=false)
    public void ignore2(){
        System.out.println("ignore 2 test");
    }
    @Test(enabled=true)
    public void ignore3(){
        System.out.println("ignore 3 test");
    }

}

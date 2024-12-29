package com.course.code.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


//@Parameters({"name","age"})
public class parameterTest {
    @Test
    @Parameters({"name", "age"})
    public void paramTest1(String name, int age) {
        System.out.println("name = " + name + ";  age = " + age);
    }

}

package com.course.code.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProvoderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.println("name=" + name + "; age=" + age);
    }

    @Test(dataProvider = "mathoddata")
    public void test1(String name, int age) {
        System.out.println("test1 name=" + name + "; age=" + age);
    }

    @Test(dataProvider = "mathoddata")
    public void test2(String name, int age) {
        System.out.println("test2 name=" + name + "; age=" + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"zhangsan", 10}, {"lisi", 20}, {"wangwu", 30}
        };
        return o;
    }

    @DataProvider(name = "mathoddata")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result=new Object[][]{
                    {"zhangsan", 20}, {"lisi", 30}, {"wangwu", 40}
            };

        } else if (method.getName().equals("test2")) {
            result=new Object[][]{
                    {"zhangsan", 50}, {"lisi", 60}, {"wangwu", 70}
            };
        }
        return result;
    }

}

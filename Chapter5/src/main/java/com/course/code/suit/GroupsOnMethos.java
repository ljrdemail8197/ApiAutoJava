package com.course.code.suit;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethos {
    @Test(groups ="server")
    public void test01(){
        System.out.println("test server method 1");
    }

    @Test(groups ="server")
    public void test02(){
        System.out.println("test server method 2");
    }

    @Test(groups ="client")
    public void test03(){
        System.out.println("test client method 1");
    }

    @Test(groups ="client")
    public void test04(){
        System.out.println("test client method 2");
    }

    @BeforeGroups("server")
    public void beforeGroups(){
        System.out.println("run before server group");
    }
    @AfterGroups("server")
    public void afterGroups(){
        System.out.println("run after server group");
    }

    @BeforeGroups("client")
    public void beforeClientGroups(){
        System.out.println("run before client group");
    }
    @AfterGroups("client")
    public void afterClientGroups(){
        System.out.println("run after client group");
    }

}


package com.course.code.groups;

import org.testng.annotations.Test;

@Test(groups="teacher"
        )
public class GroupsOnClass3 {
    public void teacher1(){

        System.out.println( "gc 3 teacher1");
    }

    public void teacher2(){

        System.out.println( "gc 3 teacher2");
    }
}

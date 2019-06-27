package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjecthr4g {

        Projecthr4gDelegate projecthr4gDelegate = new Projecthr4gDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projecthr4gDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
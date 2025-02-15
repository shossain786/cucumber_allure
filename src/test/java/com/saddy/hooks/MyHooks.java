package com.saddy.hooks;

import io.cucumber.java.Before;

public class MyHooks {

    @Before
    public void testSetUP() {
        System.out.println("Before method called!");
    }

}

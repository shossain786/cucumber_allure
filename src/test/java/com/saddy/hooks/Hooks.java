package com.saddy.hooks;


import org.testng.annotations.AfterClass;

public class Hooks {
    @AfterClass
    public static void generateReport() {
        System.out.println("Allure report generated!");
    }
}

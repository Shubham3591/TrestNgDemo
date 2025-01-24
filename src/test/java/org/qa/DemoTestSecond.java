package org.qa;

import org.testng.annotations.*;

public class DemoTestSecond {

    @Test
    public void testCase1() {
        System.out.println("Test Case -1");
    }

    @Test
    public void testCase2() {
        System.out.println("Test Case -2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println(" --- beforeMethod ---");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("-- afterMethod ---");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("---- beforeClass -----");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("---- afterClass -----");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("---- beforeTest -----");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("---- after Test -----");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("---- beforeSuite -----");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("---- AfterSuite -----");
    }
}

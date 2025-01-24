package org.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTests {
    public WebDriver driver;
    @Test
    public void ChromeTest1() {
        System.out.println(Thread.currentThread().getId());
        driver = new ChromeDriver();
        driver.get("https://github.com/");
    }

    @Test
    public void ChromeTest()
    {
        System.out.println(Thread.currentThread().getId());
        driver = new ChromeDriver();
        driver.get("https://sauce-demo.myshopify.com/");
    }

}

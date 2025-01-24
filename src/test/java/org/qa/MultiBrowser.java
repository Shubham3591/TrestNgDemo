package org.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {

    public WebDriver driver;

    @Parameters("browser")
    @BeforeClass
    public void beforeTest(String browser) {

        if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver(); //Initializing the firefox driver (Gecko)

        } else if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver(); //Initialize the chrome driver
        }
        driver.get("https://sauce-demo.myshopify.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void a_login() {
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[2]/a")).click();
        System.out.println("Clicked on co pilot SignIn");
    }

    @Test
    public void b_login1() {
        driver.navigate().back();
        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/li[4]/a")).click();
        System.out.println("Clicked on SignUp");
    }

    @AfterClass
    public void afterTest() {
        driver.quit();
    }
}

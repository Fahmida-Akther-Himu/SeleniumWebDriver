package com.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class BeforeClassTest extends BaseBeforeClassTest {

    @Test(priority = 0)
    public void verifyQaMarketplaceShouldShow() {

        Assert.assertEquals(driver.getCurrentUrl(), "https://qamarketplace.bracits.com/login?ReturnUrl=%2F");

    }


    @Test(priority = 1, timeOut = 50)
    public void verifyQaMarketplaceShouldShow_2() {

        Assert.assertEquals(driver.getCurrentUrl(), "https://qamarketplace.bracits.com/login?ReturnUrl=%2F");

    }

    @Test(priority = 2, enabled = false)
    public void verifyQaMarketplaceShouldShow_3() {

        Assert.assertEquals(driver.getCurrentUrl(), "https://qamarketplace.bracits.com/login?ReturnUrl=%2F");

    }

    @Test(priority = 3, description = "Login with 00260331")
    public void loginShouldSuccess_1() {


        driver.findElement(By.cssSelector("[class='btnStyle vendor-login-white ']")).click();
        driver.findElement(By.id("Username")).sendKeys("00260331");
        driver.findElement(By.id("Password")).sendKeys("abc123$");
        driver.findElement(By.cssSelector("[class='btnStyle vendor-login ']")).click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qamarketplace.bracits.com/");

    }

}

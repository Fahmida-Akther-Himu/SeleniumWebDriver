package com.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.time.Duration;

public class QaMarketplaceTest {

    @Test
    public void verifyQaMarketplaceShouldShow() {
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qamarketplace.bracits.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        Assert.assertEquals(driver.getCurrentUrl(), "https://qamarketplace.bracits.com/login?ReturnUrl=%2F");

        driver.quit();
    }

    @Test
    public void loginShouldSuccess_1() {
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://qamarketplace.bracits.com/login?ReturnUrl=%2F");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));


        driver.findElement(By.cssSelector("[class='btnStyle vendor-login-white ']")).click();
        driver.findElement(By.id("Username")).sendKeys("00260331");
        driver.findElement(By.id("Password")).sendKeys("abc123$");
        driver.findElement(By.cssSelector("[class='btnStyle vendor-login ']")).click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://qamarketplace.bracits.com/");

        driver.quit();
    }
}

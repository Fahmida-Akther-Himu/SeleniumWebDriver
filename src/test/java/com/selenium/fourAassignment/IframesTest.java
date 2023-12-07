package com.selenium.fourAassignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IframesTest {
    public static void main(String[] args) {
        //WebDriverManager.firefoxdriver().setup();
//WebDriver driver = new FirefoxDriver();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        System.out.println(driver.findElement(By.className("main-header")).getText());
        driver.switchTo().frame("frame1");
        System.out.println("frame1 " + driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");
        System.out.println("frame2 " + driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();

        driver.quit();

    }
}

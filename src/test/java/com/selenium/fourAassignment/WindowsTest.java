package com.selenium.fourAassignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WindowsTest {
    public static void main(String[] args) throws InterruptedException {
        //WebDriverManager.firefoxdriver().setup();
//WebDriver driver = new FirefoxDriver();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/link.html");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        String originalWindow = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        //driver.navigate().to("originalWindow")
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);
        System.out.println("New Tab " + driver.findElement(By.className("_8eso")).getText());
        driver.close();
        driver.switchTo().window(originalWindow);
        System.out.println(driver.getTitle());

        Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);
        System.out.println("New Tab " + driver.findElement(By.className("_8eso")).getText());
        driver.close();
        driver.switchTo().window(originalWindow);
        System.out.println(driver.getTitle());

        driver.quit();

    }
}

package com.selenium.secondAssignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class LocatorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        System.out.println(driver.findElement(By.className("login_logo")).getText());

        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        driver.findElement(By.cssSelector("[data-test='login-button']")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);

        driver.findElement(By.partialLinkText("Labs Backpack")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);

        List<WebElement> webElements = driver.findElements(By.tagName("a"));
        for (WebElement element : webElements) {
            System.out.println(element.getText());
        }

        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        Thread.sleep(3000);

        driver.navigate().to("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("Fahmida Akther");
        driver.findElement(By.id("userEmail")).sendKeys("fahmida.himu0904@gmail.com");
        driver.findElement(By.tagName("textarea")).sendKeys("Please enter your current address in this description box.");
        Thread.sleep(3000);

        driver.quit();

    }
}

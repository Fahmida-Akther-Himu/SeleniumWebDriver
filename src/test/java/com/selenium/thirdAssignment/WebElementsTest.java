package com.selenium.thirdAssignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebElementsTest {
    public static void main(String[] args) throws InterruptedException {
        //WebDriverManager.firefoxdriver().setup();
        //WebDriver driver = new FirefoxDriver();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(("https://demoqa.com/text-box"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        WebElement webElement = driver.findElement(By.id("userName"));
        webElement.sendKeys("Full Name");
        Thread.sleep(3000);
        webElement.clear();
        webElement.sendKeys("Fahmida Akther");

        WebElement webElement1 = driver.findElement(By.id("currentAddress"));
        System.out.println("Area name will be " + webElement1.getTagName());
        System.out.println("Print x axis: " + webElement1.getRect().x);
        System.out.println("Print y axis: " + webElement1.getRect().y);
        System.out.println(webElement1.getCssValue("border-color"));

        WebElement element = driver.findElement(By.id("submit"));
        System.out.println(element.isDisplayed());
        element.click();

        driver.navigate().to("https://demoqa.com/links");
        List<WebElement> webElements = driver.findElements(By.tagName("a"));
        for (WebElement element1 : webElements) {
            System.out.println(element1.getAttribute("href"));
        }

        driver.quit();
    }
}

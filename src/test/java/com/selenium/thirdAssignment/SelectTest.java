package com.selenium.thirdAssignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectTest {
    public static void main(String[] args) throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get(("https://demo.guru99.com/test/newtours/register.php"));

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        Select selectOne = new Select((driver.findElement(By.name("country"))));
        Thread.sleep(3000);
        selectOne.selectByVisibleText("ALBANIA");
        Thread.sleep(3000);
        selectOne.selectByIndex(6);
        Thread.sleep(3000);
        selectOne.selectByVisibleText("AUSTRALIA");
        Thread.sleep(3000);
        selectOne.selectByVisibleText("BANGLADESH");
        Thread.sleep(3000);

        for (WebElement element : selectOne.getOptions()) {
            System.out.println(element.getTagName() + " " + element.getAttribute("value") + " " + element.getText());
        }

        driver.quit();
    }
}

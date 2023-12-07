package com.selenium.fourAassignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class CookiesTest {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/buttons");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        for (Cookie cookie : driver.manage().getCookies()) {
            System.out.println(cookie.getValue() + " " + cookie.getValue());

        }

        driver.manage().addCookie(new Cookie("Fahmida Akther", "abcd"));
        System.out.println(driver.manage().getCookieNamed("Fahmida Akther"));


        System.out.println("=============================");
        for (Cookie cookie : driver.manage().getCookies()) {
            System.out.println(cookie.getName() + " " + cookie.getValue());
        }
        driver.manage().deleteCookieNamed("Fahmida Akther");
        driver.manage().deleteAllCookies();
        System.out.println("Size of cookie " + driver.manage().getCookies().size());

        driver.quit();

    }
}

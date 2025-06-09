package com.mods.orderservice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

    @Test
    public void searchHaiDoAndClose() throws InterruptedException {
        // Optional: set driver path if not already configured
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();

        try {
            // 1. Open Google
            driver.get("https://www.youtube.com/shorts/AxUyiwQe2uo");

            // 5. Wait a bit to see the results
            Thread.sleep(2000);

        } finally {
            // 6. Close the browser
            driver.quit();
        }
    }
}

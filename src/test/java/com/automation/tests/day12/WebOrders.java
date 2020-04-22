package com.automation.tests.day12;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebOrders {
    private WebDriver driver;
    private WebDriverWait wait;


    @BeforeMethod
    public void setup(){
        driver = DriverFactory.createDriver("chrome");
        wait = new WebDriverWait(driver, 10);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test", Keys.ENTER);
    }
    /**
     * 7 minutes until 5:21
     * Go to web orders page
     * Click on "Check All" button
     * Verify that all records are selected
     */
    @Test
    public void checkBoxTest(){
    }
    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}

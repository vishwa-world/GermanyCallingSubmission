package com.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
// import org.junit.jupiter.api.Test;

// import static org.junit.jupiter.api.Assertions.assertEquals;
import java.net.MalformedURLException;
import java.net.URL;

@Test
public class LoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() throws MalformedURLException {
        // Set up RemoteWebDriver with desired capabilities (e.g., Chrome)
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        
        // Set the URL of your Selenium Grid or Remote WebDriver
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        
        driver.manage().window().maximize();
        driver.get("https://app.germanyiscalling.com");
    }

    @Test
    public void successfulLogin() {
        // Locate elements
        WebElement emailField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

        // Input valid credentials
        emailField.sendKeys("valid_email@example.com");
        passwordField.sendKeys("valid_password");

        // Click login
        loginButton.click();

        // Verify successful login by checking the landing page or URL
        String expectedUrl = "https://app.germanyiscalling.com/cv/upload/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Login failed!");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

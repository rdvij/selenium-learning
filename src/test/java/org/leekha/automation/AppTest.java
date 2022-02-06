package org.leekha.automation;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

    public String baseUrl = "https://chromedriver.chromium.org/downloads";
    String driverPath = "R://Leekha//chromedriver.exe";
    public WebDriver driver;

    @Test
    public void shouldAnswerWithTrue() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        // Create driver object for CHROME browser
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
        // get the current URL of the page
        String URL = driver.getCurrentUrl();
        System.out.print(URL);
        // get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertNotNull(title);
    }
}

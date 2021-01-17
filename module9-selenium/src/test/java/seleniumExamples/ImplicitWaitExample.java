package seleniumExamples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ImplicitWaitExample {
    final String pageTitle = "AliExpress - Online Shopping for Popular Electronics, Fashion, Home & Garden, Toys & Sports, Automobiles and More products - AliExpress";
    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/windows/chrome/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.aliexpress.com/");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void checkThatLogoIsDisplayedOnMainPage() {
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div[1]/div[2]"));
        assertTrue(logo.isDisplayed());
    }

    @Test
    public void checkTitleOnMainPage() {
        assertEquals(driver.getTitle(), pageTitle);
    }
}

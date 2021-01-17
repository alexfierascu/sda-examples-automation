package seleniumExamples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumSimpleExample {

    //declare WebDriver instance
    WebDriver driver;

    //create BeforeEach step(test) to be executed before each test
    //in the setup method we initialize the driver as a ChromeDriver instance to be used in all further tests
    @BeforeEach
    public void setup() {
        //set the property for the chrome.driver to know where the driver is located
        //depending on the OS and browser version you are using we set this property
        //read more - https://www.selenium.dev/documentation/en/webdriver/driver_requirements/
        System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/windows/chrome/chromedriver.exe");
        //initialize the driver as ChromeDriver
        driver = new ChromeDriver();
        //maximize the browser window
        driver.manage().window().maximize();
        //define a string and store the url that all tests will use
        String baseURL = "https://en.wikipedia.org/";
        //navigate to baseUrl
        driver.get(baseURL);
    }


    //create AfterEach step(test) to be executed after each test
    //in the setup method we close the driver instance
    @AfterEach
    public void tearDown() {
        //close the driver instance
        driver.quit();
    }

    @Test
    public void checkWikipediaUsingPageTitle() throws InterruptedException {
        //initialize a String with the title of the page
        final String pageTitle = "Wikipedia, the free encyclopedia";
        //set a sleep timer for the page to load
        Thread.sleep(3000);
        //save in the actualTitle String variable the current title of the page
        String actualTitle = driver.getTitle();
        //make an assertion between the actual and expected page title
        assertEquals(actualTitle, pageTitle);
    }

    @Test
    public void checkThatWikipediaLogoIsDisplayed() {
        //define a WebElement instance that locates the logo element
        final WebElement pageLogo = driver.findElement(By.id("p-logo"));
        //make an assertion and check that the logo of the page is displayed
        assertTrue(pageLogo.isDisplayed());
    }

    @Test
    public void checkThatUserCanSearchOnWikipediaPageUsingSearchFunctionality() {
        //initialize a String with the title of the page we are expecting to get
        String searchPageTitle = "Michael Caine - Wikipedia";
        //define a WebElement instance that locates the search input element
        WebElement searchInputBox = driver.findElement(By.id("searchInput"));
        //define a WebElement instance that locates the search button element
        WebElement searchButton = driver.findElement(By.id("searchButton"));
        //we use the previous defined WebElement and type the text below
        searchInputBox.sendKeys("Michael Caine");
        //we use the previous defined WebElement and click on it
        searchButton.click();
        //make an assertion between the actual and expected page title
        assertEquals(driver.getTitle(), searchPageTitle);
    }
}

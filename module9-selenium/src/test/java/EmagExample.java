import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmagExample {

    WebDriver driver;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/windows/chrome/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.emag.ro/");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void checkIfPageIsOpen() throws InterruptedException {
        String pageTitle = "eMAG.ro - Libertate în fiecare zi";
        String actualTitle = driver.getTitle();
        Thread.sleep(5000);
        assertEquals(actualTitle, pageTitle);
    }

    @Test
    public void checkLogInFunction() {
        WebElement myAccount = driver.findElement(By.id("my_account"));
        assertTrue(myAccount.isDisplayed());
        myAccount.click();
    }

    @Test
    public void checkLogInButtonFunction() {
        WebElement logIn = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/a[1]"));
        assertTrue(logIn.isDisplayed());
        logIn.click();
    }

    @Test
    public void insertEmailAddress() {
        WebElement logIn = driver.findElement(By.xpath("/html/body/div[7]/div/div[2]/a[1]"));
        logIn.click();
        WebElement emailField = driver.findElement(By.id("user_login_email"));
        emailField.sendKeys("orischitor@gmail.com");
        WebElement continueButton = driver.findElement(By.id("user_login_continue"));
        assertTrue(continueButton.isDisplayed());
        continueButton.click();
    }

    @Test
    public void checkThatUserIsAbleToSearchForAProductUsingSearchFunctionality() {
        String searchWord = "cana";
        WebElement searchInput = driver.findElement(By.id("searchboxTrigger"));
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div[2]/div/form/div[1]/div[2]/button[2]/i"));
        searchInput.click();
        searchInput.sendKeys(searchWord);
        searchButton.click();
        WebElement productTitle1 = driver.findElement(By.xpath("//*[@id=\"card_grid\"]/div[1]/div[2]/div/div[2]/h2/a"));
        WebElement productTitle2 = driver.findElement(By.xpath("//*[@id=\"card_grid\"]/div[2]/div/div/div[2]/h2/a"));
        WebElement productTitle3 = driver.findElement(By.xpath("//*[@id=\"card_grid\"]/div[3]/div/div/div[2]/h2/a"));
        WebElement productTitle4 = driver.findElement(By.xpath("//*[@id=\"card_grid\"]/div[4]/div/div/div[2]/h2/a"));
        String titleProduct1Alternativ = productTitle1.getAttribute("title").toLowerCase();
        String titleProduct1 = productTitle1.getText().toLowerCase();
        String titleProduct2 = productTitle2.getText().toLowerCase();
        String titleProduct3 = productTitle3.getText().toLowerCase();
        String titleProduct4 = productTitle4.getText().toLowerCase();
        assertTrue(titleProduct1Alternativ.contains(searchWord));
        assertThat(titleProduct2, containsString(searchWord));
        assertTrue(titleProduct3.contains(searchWord));
        assertTrue(titleProduct4.contains(searchWord));
    }

    @Test
    public void test2() {
        WebElement searchInput = driver.findElement(By.id("searchboxTrigger"));
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div/div[2]/div/form/div[1]/div[2]/button[2]/i"));
        searchInput.click();
        searchInput.sendKeys("pampers");
        searchButton.click();
        List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'pampers')]"));
        assertTrue(list.size() > 0);
    }
}

package depurtat.tests;


import depurtat.pages.LoginPage;
import depurtat.pages.MainPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SimpleTests {
    WebDriver driver;
    MainPage mainPage;
    LoginPage loginPage;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/windows/chrome/chromedriver.exe");
        driver = new ChromeDriver();
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.get("https://www.depurtat.ro/");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    @Order(1)
    public void checkThatUserIsAbleToAccessMainPage() {
        assertEquals(driver.getTitle(), mainPage.getTitle());
        assertTrue(mainPage.checkThatIamOnMainPage());
    }

    @Test
    @Order(2)
    public void checkThatUserIsAbleToLoginWithCorrectUserAndPassword() {
        String user = "eneredqa@gmail.com", password = "Parola123!@";
        String titleUserPage = "dEpurtat - Vizualizare cont";
        mainPage.navigateToLoginPage();
        loginPage.inputUserNameAndPassword(user, password);
        assertEquals(driver.getTitle(), titleUserPage);
        assertEquals(driver.getCurrentUrl(), "https://www.depurtat.ro/profile");
    }
}

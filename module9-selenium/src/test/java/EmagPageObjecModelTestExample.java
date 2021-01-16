import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.EmagLandingPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EmagPageObjecModelTestExample {
    WebDriver driver;
    EmagLandingPage emagLandingPage;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/windows/chrome/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        emagLandingPage = new EmagLandingPage(driver);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void checkThatAUserIsAbleToLoginToEmagWithEmailAndPassword() {
        String titleEmailPage = "eMAG.ro - Libertate în fiecare zi";
        String email = "cevaAdresaDeEmail";
        String password = "parolaSmechera";
        emagLandingPage.loginWithEmailAndPassword(email, password);
        assertTrue(emagLandingPage.checkThatUserIsLogedIn());
        assertEquals(driver.getTitle(), titleEmailPage);
    }
}

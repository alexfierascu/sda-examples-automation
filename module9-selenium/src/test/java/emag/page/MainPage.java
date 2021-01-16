package emag.page;

import emag.utils.ElementUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainPage {
    private static WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public static void loginWithEmailAndPassword(String email, String password) {
        driver.get("https://www.emag.ro/");
        WebElement butonContulMeu = driver.findElement(By.id("my_account"));
        butonContulMeu.click();
        assertEquals(driver.getTitle(), "eMAG.ro - Libertate în fiecare zi");
        WebElement inputEmailAddress = driver.findElement(By.id("user_login_email"));
        ElementUtils.inputDataIntoElement(inputEmailAddress, email);
        WebElement butonContinua = driver.findElement(By.id("user_login_continue"));
        butonContinua.click();
        WebElement inputPassword = driver.findElement(By.id("user_login_password"));
        ElementUtils.inputDataIntoElement(inputPassword, password);
        butonContinua.click();
    }

    public static boolean checkThatUserIsLogedIn() {
        String expectedUrl = "https://www.emag.ro/";
        String actualUrl = driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)) {
            return true;
        } else {
            return false;
        }
    }
}

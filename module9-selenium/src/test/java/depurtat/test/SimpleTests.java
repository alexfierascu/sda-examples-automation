package depurtat.test;


import depurtat.page.FavouritePage;
import depurtat.page.LoginPage;
import depurtat.page.MainPage;
import depurtat.page.NoutatiPage;
import depurtat.utils.NavigationUtils;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SimpleTests {
    WebDriver driver; // declarare de un obiect de tip WebDriver
    MainPage mainPage;
    LoginPage loginPage;
    NavigationUtils navigationUtils;
    NoutatiPage noutatiPage;
    FavouritePage favouritePage;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/windows/chrome/chromedriver.exe");
        driver = new ChromeDriver(); //initializare driver ca ChromeDriver
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        navigationUtils = new NavigationUtils(driver);
        noutatiPage = new NoutatiPage(driver);
        favouritePage = new FavouritePage(driver);
        driver.manage().window().maximize();
        driver.get("https://www.depurtat.ro/");
    }

    @AfterEach
    public void tearDown() {
        //   driver.quit();
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
        navigationUtils.navigateToLoginPage();
        loginPage.inputUserNameAndPassword(user, password);
        assertEquals(driver.getTitle(), titleUserPage);
        assertEquals(driver.getCurrentUrl(), "https://www.depurtat.ro/profile");
    }

    @Test
    @Order(3)
    public void checkThatUserIsAbleToLogOut() {

        String user = "eneredqa@gmail.com", password = "Parola123!@";
        String titleUserPage = "dEpurtat - Vizualizare cont";
        navigationUtils.navigateToLoginPage();
        loginPage.inputUserNameAndPassword(user, password);
        assertEquals(driver.getTitle(), titleUserPage);
        assertEquals(driver.getCurrentUrl(), "https://www.depurtat.ro/profile");
        //todo - logout
    }

    @Test
    @Order(4)
    public void checkThatUserIsAbleToAddMultipleProductsToFavourite() {
        navigationUtils.navigateToNoutatiPage();
        noutatiPage.addMultipleProductsToFavourite();
        int counterFavourite = noutatiPage.getNumberOfFavouriteProducts();
        assertEquals(counterFavourite, 4);
    }

    @Test
    @Order(5)
    public void checkThatUserIsAbleToRemoveAFavouriteProductFromItsFavouritesList() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        navigationUtils.navigateToNoutatiPage();
        noutatiPage.addMultipleProductsToFavourite();
        navigationUtils.navigateToFavouritePage();
        int counterFavouriteProducts = 4;
        assertEquals(noutatiPage.getNumberOfFavouriteProducts(), counterFavouriteProducts);
        favouritePage.deleteMultipleProductsFromFavouritesList();
        wait.until(ExpectedConditions.visibilityOf(noutatiPage.getButtonAllFavouriteProducts()));
        assertEquals(noutatiPage.getNumberOfFavouriteProducts(), 2);
    }

    @Test
    @Order(5)
    public void checkThatUserIsAbleToSorProductFromNoutatiPageOrderBy() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        navigationUtils.navigateToNoutatiPage();
        noutatiPage.getDropdownCategorii().click();
        noutatiPage.getCheckboxGhete().click();
//        navigationUtils.navigateToFavouritePage();
//        int counterFavouriteProducts = 4;
//        assertEquals(noutatiPage.getNumberOfFavouriteProducts(), counterFavouriteProducts);
//        favouritePage.deleteMultipleProductsFromFavouritesList();
//        wait.until(ExpectedConditions.visibilityOf(noutatiPage.getButtonAllFavouriteProducts()));
//        assertEquals(noutatiPage.getNumberOfFavouriteProducts(), 2);
    }
}

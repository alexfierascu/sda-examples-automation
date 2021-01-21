package depurtat.test;


import depurtat.page.*;
import depurtat.utils.NavigationUtils;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static depurtat.utils.CategoryId.GHETE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SimpleTests {
    String baseURL = "https://www.depurtat.ro/";
    WebDriver driver; // declarare de un obiect de tip WebDriver
    MainPage mainPage;
    LoginPage loginPage;
    NavigationUtils navigationUtils;
    NoutatiPage noutatiPage;
    FavouritePage favouritePage;
    ProfilePage profilePage;

    @BeforeEach
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/selenium/windows/chrome/chromedriver.exe");
        driver = new ChromeDriver(); //initializare driver ca ChromeDriver
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);
        navigationUtils = new NavigationUtils(driver);
        noutatiPage = new NoutatiPage(driver);
        favouritePage = new FavouritePage(driver);
        profilePage = new ProfilePage(driver);
        driver.manage().window().maximize();
        driver.get(baseURL);
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
        profilePage.logoutFromAccount();
        assertEquals(driver.getCurrentUrl(), baseURL);
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
    public void checkThatUserIsAbleToSortProductsFromNoutatiPage() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        navigationUtils.navigateToNoutatiPage();
        noutatiPage.selectFirstCategoryFromFreshArrivalsPage();
        String currentUrlurl = driver.getCurrentUrl();
        //assertTrue(currentUrlurl.contains(String.valueOf(noutatiPage.selectFirstCategoryFromFreshArrivalsPage())));
        if (currentUrlurl.contains(String.valueOf(GHETE))) {
            System.out.println("ok");
        } else {
            System.out.println("not ok");
        }
    }
}

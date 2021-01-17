package depurtat.utils;

import depurtat.page.MainPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationUtils extends MainPage {
    private WebDriver driver;

    public NavigationUtils(WebDriver driverPagina) {
        super(driverPagina);
        this.driver = driverPagina;
        //PageFactory.initElements(driverPagina, this);
    }


    public void navigateToLoginPage() {
        getButtonLogin().click();
    }

    public void navigateToNoutatiPage() {
        getButtonNoutati().click();
    }

    public void navigateToFavouritePage() {
        getButtonFavorite().click();
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}

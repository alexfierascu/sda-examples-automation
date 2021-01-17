package depurtat.page;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driverPagina) {
        this.driver = driverPagina;
        PageFactory.initElements(driverPagina, this);
    }

    private String title = "dEpurtat - Cel mai bun raport calitate/preț la încălțăminte de damă";


    //PageFactory locator strategy
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div[1]/div/div[1]/a")
    private WebElement buttonSearch;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div[1]/div/a[2]/span[1]")
    private WebElement buttonFavorite;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div[1]/div/a[3]/span[1]")
    private WebElement buttonLogin;
    @FindBy(xpath = "//*[@id=\"header_middle_cart_preview\"]/a/span[2]")
    private WebElement buttonBasketShopping;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div[1]/a[2]/img")
    private WebElement logo;

    public boolean checkThatIamOnMainPage() {
        if (getButtonSearch().isDisplayed() && getButtonFavorite().isDisplayed() &&
                getButtonLogin().isDisplayed() && getButtonBasketShopping().isDisplayed()
                && getLogo().isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public void navigateToLoginPage() {
        buttonLogin.click();
    }
}

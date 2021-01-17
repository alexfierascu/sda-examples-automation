package depurtat.page;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private String title = "Acces cont - dEpurtat";
    @FindBy(id = "profile_email")
    private WebElement inputEmailField;
    @FindBy(id = "profile_password")
    private WebElement inputPasswordField;
    @FindBy(xpath = "//*[@id=\"page_login_form\"]/div[4]/button")
    private WebElement buttonAccesCont;

    public void inputUserNameAndPassword(String email, String password) {
        getInputEmailField().click();
        getInputEmailField().sendKeys(email);
        getInputPasswordField().click();
        getInputPasswordField().sendKeys(password);
        getButtonAccesCont().click();
    }

}

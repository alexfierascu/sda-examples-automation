package depurtat.page;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class ProfilePage {
    private WebDriver driver;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private String title = "dEpurtat - Vizualizare cont";
    @FindBy(xpath = "//*[@id=\"page_content\"]/div[4]/div[1]/div/ul/li[6]/a")
    private WebElement buttonLogout;

    public void logoutFromAccount() {
        getButtonLogout().click();
    }
}

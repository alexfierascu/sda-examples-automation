package depurtat.page;

import depurtat.utils.NavigationUtils;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class FavouritePage {
    private WebDriver driver;
    NavigationUtils navigationUtils;

    public FavouritePage(WebDriver driverPagina) {
        this.driver = driverPagina;
        navigationUtils = new NavigationUtils(driverPagina);
        PageFactory.initElements(driverPagina, this);
    }

    private String title = "dEpurtat";
    private String pageHeaderMessage = "Produse favorite";
    private String messageNoFavouriteProducts = "Nu exista niciun produs in lista ta de Favorite.";

    @FindBy(xpath = "//*[@id=\"page_content\"]/p")
    private WebElement noFavouriteProducts;

    @FindBy(xpath = "//*[@id=\"page_content\"]/div[4]/div/div[1]/div/div[1]/a[2]/span")
    private WebElement deleteFirstProductFromFavouriteList;

    @FindBy(xpath = "//*[@id=\"page_content\"]/div[4]/div/div[2]/div/div[1]/a[2]/span")
    private WebElement deleteSecondProductFromFavouriteList;


    private void deleteProductFromFavourites(WebElement element) {
        navigationUtils.scrollToElement(element);
        element.click();
    }

    public void deleteMultipleProductsFromFavouritesList() {
        deleteProductFromFavourites(deleteFirstProductFromFavouriteList);
        deleteProductFromFavourites(deleteSecondProductFromFavouriteList);
    }

    public boolean isFavouriteListOfProductsEmpty() {
        if (noFavouriteProducts.getText().equals(messageNoFavouriteProducts)) {
            return true;
        } else {
            return false;
        }
    }

}

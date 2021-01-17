package depurtat.page;

import depurtat.utils.NavigationUtils;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


@Getter
public class NoutatiPage {
    private WebDriver driver;
    NavigationUtils navigationUtils;

    public NoutatiPage(WebDriver driverPagina) {
        this.driver = driverPagina;
        navigationUtils = new NavigationUtils(driverPagina);
        PageFactory.initElements(driverPagina, this);
    }

    private String title = "Produse noi - dEpurtat";
    private String pageHeaderMessage = "Produse noi";
    @FindBy(xpath = "//*[@id=\"page_content\"]/h1")
    private WebElement pageHeaderWebelement;

    @FindBy(xpath = "//*[@id=\"page_content\"]/div[5]/div/div[1]/div/div[1]/a[2]/span")
    private WebElement buttonAddToFavourite1;
    @FindBy(xpath = "//*[@id=\"page_content\"]/div[5]/div/div[2]/div/div[1]/a[2]/span")
    private WebElement buttonAddToFavourite2;
    @FindBy(xpath = "//*[@id=\"page_content\"]/div[5]/div/div[3]/div/div[1]/a[2]/span")
    private WebElement buttonAddToFavourite3;
    @FindBy(xpath = "//*[@id=\"page_content\"]/div[5]/div/div[5]/div/div[1]/a[2]/span")
    private WebElement buttonAddToFavourite5;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div[1]/div/a[2]/span[1]")
    private WebElement buttonAllFavouriteProducts;
    @FindBy(xpath = "//*[@id=\"page_top_box_product_filters_content\"]/div[1]/div/button")
    private WebElement dropdownCategorii;
    @FindBy(xpath = "//*[@id=\"page_top_box_cat_cat_content\"]/div[2]/div/ul/li[1]/div/a")
    private WebElement checkboxGhete;

    private void addProductToFavourites(WebElement element) {
        navigationUtils.scrollToElement(element);
        element.click();
    }

    public void addMultipleProductsToFavourite() {
        addProductToFavourites(buttonAddToFavourite1);
        addProductToFavourites(buttonAddToFavourite2);
        addProductToFavourites(buttonAddToFavourite3);
        addProductToFavourites(buttonAddToFavourite5);
    }

    public int getNumberOfFavouriteProducts() {
        navigationUtils.scrollToElement(buttonAllFavouriteProducts);
        return Integer.parseInt(buttonAllFavouriteProducts.getAttribute("data-counter"));
    }

}

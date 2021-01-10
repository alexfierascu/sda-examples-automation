package model;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebElement;

@Getter
@Setter
public class ProductDescription {
    private String numberOfReviews;
    private String title;
    private String seeAlternativesLink;
    private double finalPrice;
    private double initialPrice;
    private double discount;
    private boolean isInStock;
    private boolean isGenius;
    private WebElement buttonAddProductInBasket;
}

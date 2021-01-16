package emag.utils;

import org.openqa.selenium.WebElement;

public class ElementUtils {

    public static void inputDataIntoElement(WebElement element, String data) {
        element.isDisplayed();
        element.click();
        element.sendKeys(data);
    }
}

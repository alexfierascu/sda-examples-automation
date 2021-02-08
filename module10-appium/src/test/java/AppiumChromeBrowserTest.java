import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumChromeBrowserTest {


    AppiumDriver androidDriver;

    @BeforeEach
    public void setup() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appPackage", "com.android.chrome");
        desiredCapabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
        desiredCapabilities.setCapability("unicodeKeyboard", true);
        androidDriver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
    }

    @AfterEach
    public void tearDown() {
        androidDriver.quit();
    }

    @Test
    public void testChrome() throws InterruptedException {
        MobileElement el1 = (MobileElement) androidDriver.findElementById("com.android.chrome:id/terms_accept");
        el1.click();
        MobileElement el2 = (MobileElement) androidDriver.findElementById("com.android.chrome:id/negative_button");
        el2.click();
        //TODO: add wait until element visible
        Thread.sleep(5000);
        MobileElement el3 = (MobileElement) androidDriver.findElementById("com.android.chrome:id/search_box_text");
        el3.click();
        MobileElement el4 = (MobileElement) androidDriver.findElementById("com.android.chrome:id/url_bar");
        el4.sendKeys("Test");

    }
}

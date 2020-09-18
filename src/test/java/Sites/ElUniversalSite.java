package Sites;

import Pages.EnglishPage;
import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElUniversalSite {
    protected WebDriver driver;

    public ElUniversalSite(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage homePage() {
        return new HomePage(driver);
    }
    public EnglishPage englishPage() {
        return new EnglishPage(driver);
    }




}

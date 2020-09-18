package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {
    @FindBy(xpath="//ul[@id='main-menu']//a[@href= '/english']")
    WebElement inglesLocator;

    @FindBy(css= "#top-nav .logo")
    WebElement logoLocator;

    @FindBy(css= "#close")
    WebElement closeLocator;

    @FindBy(css= ".menu li")
    List<WebElement> menuLocator;


    /*By inglesLocator = By.xpath("//ul[@id='main-menu']//a[@href= '/english']");
    By logoLocator = By.cssSelector("#top-nav .logo");
    By closeLocator = By.cssSelector("#close");
    By menuLocator = By.cssSelector(".menu li");*/


    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void goTo(String url) {
        driver.get(url);
        System.out.println("La página del universal fué cargada");
    }

    public void verificarHomePage() throws Exception {
        clickonElement(closeLocator);
        isElementpresent(logoLocator);
        System.out.println("Estas en la página del universal");

    }

    public void seleccionarSeccion(String menuOption) throws Exception {
        clickonElement(inglesLocator);
        System.out.println("Elejiste la sección : " + menuOption);

    }

    public void seleccionarDeMenu(String opcion) throws Exception {
        isListpresent(menuLocator);

        for (WebElement element: menuLocator)
        {
           if (element.getText().equals(opcion.trim()))
            {
                element.click();
                System.out.println("La opción del menu " + opcion.trim() + " fué seleccionada" );
                break;
            }
        }
    }
}

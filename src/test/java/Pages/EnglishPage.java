package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;
import Utils.Utils;

public class EnglishPage extends BasePage{

    @FindBy(css=".ceh-PortadaDeSeccion_Titulo")
    WebElement labelLocator;

    @FindBy(css="#wg_2128452")
    WebElement tipoCambioLocator;

    @FindBy(css=".w-v2-TipoCambio_Contenedor-Compra .w-v2-TipoCambio_Numero")
    WebElement tipoCambioCompraNumero;

    @FindBy(css=".w-v2-TipoCambio_Contenedor-Compra .w-v2-TipoCambio_Numero+p")
    WebElement tipoCambioCompraPorcentaje;

    @FindBy(css=".w-v2-TipoCambio_Contenedor-Venta .w-v2-TipoCambio_Numero")
    WebElement tipoCambioVentaNumero ;

    @FindBy(css=".w-v2-TipoCambio_Contenedor-Venta .w-v2-TipoCambio_Numero+p")
    WebElement tipoCambioVentaporcentaje;



  /*  By labelLocator = By.cssSelector(".ceh-PortadaDeSeccion_Titulo");
    By tipoCambioLocator = By.cssSelector("#wg_2128452");
    By tipoCambioCompraNumero = By.cssSelector(".w-v2-TipoCambio_Contenedor-Compra .w-v2-TipoCambio_Numero");
    By tipoCambioCompraPorcentaje = By.cssSelector(".w-v2-TipoCambio_Contenedor-Compra .w-v2-TipoCambio_Numero+p");
    By tipoCambioVentaNumero = By.cssSelector(".w-v2-TipoCambio_Contenedor-Venta .w-v2-TipoCambio_Numero");
    By tipoCambioVentaporcentaje = By.cssSelector(".w-v2-TipoCambio_Contenedor-Venta .w-v2-TipoCambio_Numero+p");
*/

    public EnglishPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void verificarPagina(String label) throws Exception {
        isElementpresent(labelLocator);
        assertEquals("No estas en la página de : ", label, labelLocator.getText().trim());
        System.out.println("Estas en la página de :" + labelLocator.getText());
    }

    public void verificarTipoCambioNumero() throws Exception {
        isElementpresent(tipoCambioLocator);
        isElementpresent(tipoCambioCompraNumero);
        isElementpresent(tipoCambioVentaNumero);

        System.out.println("Tipo de Cambio :");
        System.out.println("Compra : " + tipoCambioCompraNumero.getText());
        System.out.println("Venta : " + tipoCambioVentaNumero.getText());
    }

    public void verificarTipoCambioPorcentajes() throws Exception {
        isElementpresent(tipoCambioCompraPorcentaje);
        isElementpresent(tipoCambioVentaporcentaje);

        System.out.println("Porcentajes:");

        System.out.println("Compra Porcentaje : " + tipoCambioCompraPorcentaje.getText());
        System.out.println("Venta Porcentaje : " + tipoCambioVentaporcentaje.getText());

    }

    public void validarColorenPorcentajes() {
        String color;

        color = tipoCambioCompraPorcentaje.getCssValue("color");
        System.out.println("Compra Porcentaje : " + tipoCambioCompraPorcentaje.getText() + " y su color es :" + Utils.getColor(color));

        color = tipoCambioVentaporcentaje.getCssValue("color");
        System.out.println("Venta Porcentaje : " + tipoCambioVentaporcentaje.getText() + " y su color es :" + Utils.getColor(color));
    }


}

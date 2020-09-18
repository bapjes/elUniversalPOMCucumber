package Steps;
import Sites.ElUniversalSite;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class HomeSteps {
   public  ElUniversalSite elUniversalSite;
   String url = "https://www.eluniversal.com.mx/";

   public HomeSteps(Hooks hooks)
    {
        this.elUniversalSite = hooks.getElUniversalSite();
    }


   @Given("Estoy en la pagina de El Universal")
    public void Estoy_en_la_pagina_de_El_Universal() throws Exception {

     elUniversalSite.homePage().goTo(url);
     elUniversalSite.homePage().verificarHomePage();
   }

    @When("Elijo la opcion {string}")
    public void elijoLaOpcion(String arg0) throws Exception {
       elUniversalSite.homePage().seleccionarSeccion(arg0);
    }


    @Then("Valido que este en la página de {string}")
    public void validoQueEsteEnLaPáginaDe(String arg0) throws Exception {
       elUniversalSite.englishPage().verificarPagina(arg0);
    }


    @And("valido que el tipo de cambio y los porcentajes sean desplegados")
    public void validoQueElTipoDeCambioYLosPorcentajesSeanDesplegados() throws Exception {
       elUniversalSite.englishPage().verificarTipoCambioNumero();
       elUniversalSite.englishPage().verificarTipoCambioPorcentajes();


    }


    @And("y que el porcentaje negativo aparezca en rojo y el porcentaje positivo aparezca en verde")
    public void yQueElPorcentajeNegativoAparezcaEnRojoYElPorcentajePositivoAparezcaEnEnVerde() {
       elUniversalSite.englishPage().validarColorenPorcentajes();
    }
}

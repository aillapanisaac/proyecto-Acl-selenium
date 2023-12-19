package demo.utilities.website;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

// para mandar a llamar la pagina web con la url
public class WebSite {

    //esta clase se compartira para poser ser utilizada en las funciones o metdos creadas
    @Steps(shared = true)
    PageObject swag_labs;

    @Step("Navegar al sitio web")
    public void navigateTo(String url){
        swag_labs.setDefaultBaseUrl(url);
        swag_labs.open();
    }

}

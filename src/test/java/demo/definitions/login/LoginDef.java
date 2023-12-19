package demo.definitions.login;


import demo.steps.login.LoginStep;
import demo.steps.validations.ValidationStep;
import demo.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

// validacion a nivel de spep definicion desde aqui se trabaja junto al archivo de stepdefinition
public class LoginDef {
    // Aqui estoy llamando mis archivos para trabajar con ellos
    // el shared = true es para indicar que quiero compartir esta metodo
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationStep validate;

    //aqui empiezo a conectar los pasos de feature
    @Given("el usuario navega al sitio web")
    public void userNavigateTo(){
        url.navigateTo("https://www.saucedemo.com/");
    }
    @When("ingresa credenciales validas")
    public void userLoginWithValidCredentials(){
        login.typeUsername("standard_user");
        login.typePassword("secret_sauce");
        login.clickLogin();
    }
    @Then("la aplicacion deberia mostrar el modulo principal de productos")
    public void systemShowProductModule(){
        Assert.assertTrue(validate.titleIsVisible());
    }


    @When("ingresa credenciales invalidas")
    public void userLoginWithInvalidCredentials(){
        login.typeUsername("standard_user");
        login.typePassword("123456");
        login.clickLogin();
    }
    @Then("la aplicacion deberia mostrar un mensaje de error")
    public void systemShowErrorMessage(){
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }

}

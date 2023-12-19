package demo.definitions.shopping;

import demo.steps.products.SelectProductStep;
import demo.steps.shopping.ShoppingCartStep;
import demo.steps.validations.ValidationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class ShoppingDef {
    @Steps(shared = true)
    SelectProductStep selectProduct;

    @Steps(shared = true)
    ValidationStep validate;

    @Steps(shared = true)
    ShoppingCartStep shoppingCart;


    @And("agrega productos al carrito de compras")
    public void userAddProducts(){
        selectProduct.addProducts(3);
    }

    @And("da click en el icono del carrito")
    public void userClickSoppingCartIcon(){
        selectProduct.clickShoppingCartIcon();
    }
    @Then("el sistema deberia listar los productos agregados en el carrito de compras")
    public void systemListProducts(){
        Assert.assertTrue(validate.productsAreDisplayed());
    }

    @Then("el sistema deberia mostrar la cesta sin productos")
    public void systemShowEmptyShoppingCart(){
        Assert.assertTrue(validate.shoppingCartIsEmpty());
    }

    @When("completa todo el registro de la orden")
    public void userCompleteOrder(){
        shoppingCart.clickChekoutButton();
        shoppingCart.typeFirstName("Isaac");
        shoppingCart.typelastName("Aillapan");
        shoppingCart.typePostal("0077");
        shoppingCart.clickContinue();
        shoppingCart.clickFinish();
    }

    @Then("el sistema deberia completar la compra")
    public void systemProcessShoppingCart(){
        Assert.assertTrue(validate.orderTextIsDisplayed());
    }

}

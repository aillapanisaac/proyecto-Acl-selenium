package com.demo.cl.steps.validations;

import com.demo.cl.pages.validations.ValidationPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPage {

    // se validara si se visualiza el titulo
    @Step("Validar visualizacion del modulo productos")
    public Boolean titleIsVisible(){
        return lbl_product.isDisplayed();
    }
    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplayed(){
        return lbl_errorMessage.isDisplayed();
    }

    @Step("Validar los productos listados en el carrito")
    public Boolean productsAreDisplayed(){
        for (WebElementFacade product:productsList){
            if (product.isDisplayed()){
                return true;
            }
        }
        return false;
    }

    //valido si el producto esta dentro de la lista del carrito de compra , logica inversa
    @Step("Validar que el carrito este vacio de productos")
    public Boolean shoppingCartIsEmpty(){
        for(WebElementFacade product:productsList){
            if(!product.isDisplayed()){
                return false;
            }
        }
        return true;
    }

    @Step("Validar finalizacion de orden")
    public Boolean orderTextIsDisplayed(){
        return lbl_order.isDisplayed();
    }

}

package com.demo.cl.steps.shopping;

import com.demo.cl.pages.shopping.ShoppingCartPage;
import net.thucydides.core.annotations.Step;

public class ShoppingCartStep extends ShoppingCartPage {

    //creo las funciones para validar los clic en los botones

    @Step("Click en checkout")
    public void clickChekoutButton(){
        checkoutButton.click();
    }

    // creo funcion para que me permita ingresar los datos en your information
    @Step("Ingresar nombre")
    public void typeFirstName(String firstname){
        txt_firstname.sendKeys(firstname);
    }

    @Step("Ingresar apellido")
    public void typelastName(String lastname){
        txt_lastname.sendKeys(lastname);
    }

    @Step("Ingresar codigo postal")
    public void typePostal(String postal){
        txt_postal.sendKeys(postal);
    }
    @Step("Click en continuar")
    public void clickContinue(){
        continueButton.click();
    }
    @Step("Click en finalizar")
    public void clickFinish(){
        finishButton.click();
    }



}

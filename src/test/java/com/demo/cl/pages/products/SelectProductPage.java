package com.demo.cl.pages.products;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SelectProductPage extends PageObject {
    // aqui mapeo mi producto para agregarlo al carrito
    @FindBy(xpath = "(//button[contains(@class,'btn btn_primary btn_small')])")
    protected List<WebElementFacade> products;

    // aqui capturo el boton del carrito
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    protected WebElementFacade shoppingCartIcon;

}

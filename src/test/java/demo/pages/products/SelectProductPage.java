package demo.pages.products;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SelectProductPage extends PageObject {

    @FindBy(xpath = "(//button[contains(@class,'btn btn_primary btn_small')])")
    protected List<WebElementFacade> products;


    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    protected WebElementFacade shoppingCartIcon;

}

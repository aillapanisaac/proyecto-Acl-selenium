package demo.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;


public class ValidationPage extends PageObject {
    @FindBy(xpath = "//span[contains(@class,'title')]")
    protected WebElementFacade lbl_product;

    @FindBy(xpath = "//h3[@data-test='error' and text()='Epic sadface: Username and password do not match any user in this service']")
    protected WebElementFacade lbl_errorMessage;


    @FindBy(xpath = "//div[@class='inventory_item_name']")
    protected List<WebElementFacade> productsList;

    @FindBy(xpath = "//h2[text()='Thank you for your order!']")
    protected WebElementFacade lbl_order;
}

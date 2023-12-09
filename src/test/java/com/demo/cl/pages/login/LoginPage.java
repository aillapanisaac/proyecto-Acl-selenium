package com.demo.cl.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

// Se esta heredanddo de la clase pageobject
public class LoginPage extends PageObject {
    //para mapear del elemento user name y se captura por el id en finby de esta manera se identifica nuestro elemento
    @FindBy(id = "user-name")
    protected WebElementFacade txt_username;

    // se realiza captura de nuestro elemnto
    @FindBy(id = "password")
    protected WebElementFacade txt_password;

    // ahora para el boton login

    @FindBy(id = "login-button")
    protected WebElementFacade btn_login;


}

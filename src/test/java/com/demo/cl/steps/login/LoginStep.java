package com.demo.cl.steps.login;

// aqui se realizan las acciones para ingresar los datos y realizar los click

import com.demo.cl.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep extends LoginPage {

    // funcion para escribir los pasos e ingresar el texto
    @Step("Ingresar usuario")
    public void typeUsername(String username){
        txt_username.sendKeys(username);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password){
        txt_password.sendKeys(password);
    }

    @Step("Click en el boton login")
    public void clickLogin(){
        btn_login.click();
    }

}

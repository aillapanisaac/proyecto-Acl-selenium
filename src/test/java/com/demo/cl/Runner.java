package com.demo.cl;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

//esta prueba esta integrada con cucumber y serenity
@RunWith(CucumberWithSerenity.class)
// feature es para setear nuestros archivo de cucumber
// glue es para setear nuestro pasos login
// tags es para correr nuestro archivo por etiquetas
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.demo.cl.definitions",
        tags = "@Suite"
)
public class Runner {

}

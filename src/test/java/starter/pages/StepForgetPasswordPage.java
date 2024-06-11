package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class StepForgetPasswordPage extends PageObject {
    @FindBy(xpath = "//h5[contains(text(),'He olvidado mi contraseña')]")
    WebElementFacade forgetLink;
    @Step("Verificacion que nos encontramos en la pagina recuperacion contrasena")
    public boolean ForgetPasswordPage(){
        return forgetLink.isVisible();
    }
}

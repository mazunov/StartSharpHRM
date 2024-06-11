package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class StepLoginPage extends PageObject {
    @FindBy(id="LoginPanel0_Username")
    WebElementFacade username;
    @FindBy(id="LoginPanel0_Password")
    WebElementFacade password;
    @FindBy(id="LoginPanel0_LoginButton")
    WebElementFacade submitButton;
    @FindBy(xpath = "//div[contains(text(),'Error de validación: ¡Nombre de usuario o contrase')]")
    WebElementFacade errorMenssage;
    @FindBy(xpath = "//a[contains(text(),'¿Olvidaste tu contraseña?')]")
    WebElementFacade linkText;

    @Step("Ingresar usuario")
    public void inputUserName(String userName) {
        username.clear();
        username.sendKeys(userName);
    }
    @Step("Ingresar contrasena")
    public void inputPassword(String passWord) {
        password.clear();
        password.sendKeys(passWord);
    }
    @Step("Dar click boton Iniciar Sesion")
    public void clickLogin() {
        submitButton.click();
    }
    @Step("Mensaje de error en credenciales no validas")
    public String errorMessage(){
        String actualErrorMessage = errorMenssage.getText();
        return actualErrorMessage;
    }
    @Step("Click cuando olvido la contrasena")
    public void clickForgetPasswordLink(){
        linkText.click();
        System.out.println("Clicked on Forguet Password Link");
    }
}

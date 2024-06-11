package starter.stepdefinitions;

import starter.pages.StepLoginPage;
import starter.pages.StepDashboardPage;
import starter.pages.StepForgetPasswordPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.annotations.Steps;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageDefinitions {

    @Steps
    StepLoginPage loginPage;
    @Steps
    StepDashboardPage dashboardPage;
    @Steps
    StepForgetPasswordPage forgetPasswordPage;
    @Dado("El usuario esta en la pagina de inicio")
    public void elUsuarioEstaEnLaPaginaDeInicio(){
        loginPage.open();
    }
    @Cuando("^El usuario introduce el nombre de usuario (.*)")
    public void elUsuarioIntroduceElNombreDeUsuario(String UserName){
        loginPage.inputUserName(UserName);
    }
    @Y("^El usuario introduce contrasena como (.*)")
    public void elUsuarioIntroduceContrasena(String passWord){
        loginPage.inputPassword(passWord);
        loginPage.clickLogin();
    }
    @Entonces("El usuario deberia poder iniciar sesion correctamente")
    public void elUsuarioDeberiaPoderInniciarSesionCorrectamente(){
        dashboardPage.loginVerify();
    }
    @Entonces("^El usuario debe poder ver el mensaje de error (.*)$")
    public void elUsuarioDebePoderVerElMensajeDeError(String expectedErrorMenssage){
        String actualErrorMessage = loginPage.errorMessage();
        assertEquals(expectedErrorMenssage,actualErrorMessage);
    }
    @Cuando("El usuario hace click en el enlace olvido su contrasena")
    public void elUsuarioHaceClickEnElEnlaceOlvidoSuContrasena(){
        loginPage.clickForgetPasswordLink();
    }
    @Entonces("El usuario debe poder ver una nueva pagina que contenga el boton de restablecer contrasena")
    public void elUsuarioDebePoderVerUnaNuevaPaginaQueContengaElBotonDeRestablecerContrasena(){
        assertTrue(forgetPasswordPage.ForgetPasswordPage());
    }

}

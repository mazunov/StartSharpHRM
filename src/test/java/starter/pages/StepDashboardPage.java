package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class StepDashboardPage extends PageObject {
    @FindBy(xpath = "//h1[contains(text(),'Tablero')]")
    WebElementFacade dashboardText;
    @Step("Logueo satisfactorio")
    public void loginVerify(){
        String dashboardTitle = dashboardText.getText();
        assertThat(dashboardTitle, containsString("Tablero"));
    }

}

package starter.stepdefinitions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import starter.pages.StepDashboardPage;

public class DashboardPageDefinitions {

    @Steps
    StepDashboardPage dashPage;

    @Step
    public void verifyAdminLogin(){dashPage.loginVerify();}
}

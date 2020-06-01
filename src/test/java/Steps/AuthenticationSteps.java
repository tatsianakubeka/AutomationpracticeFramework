package Steps;

import Pages.AuthenticationPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class AuthenticationSteps extends ScenarioSteps {

    private AuthenticationPage onPage;

    @Step
    public void checkTextOnAuthenticationPage () {
        onPage.checkTextOnAuthenticationPage();
    }

    @Step
    public void fillInEmailAddressField (String email) {
        onPage.fillInEmailAddressField(email);
    }

    @Step
    public void fillInPasswordField (String password) {
        onPage.fillInPasswordField(password);
    }

    @Step
    public void clickOnSignInButtonOnAlreadyRegisteredForm () {
        onPage.clickOnSignInButtonOnAlreadyRegisteredForm();
    }

    @Step
    public void checkTextExistError () {
        onPage.checkTextExistError();
    }

    @Step
    public void checkTextInvalidPassword () {
        onPage.checkTextInvalidPassword();
    }

}

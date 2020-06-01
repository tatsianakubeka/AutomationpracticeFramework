package Steps;

import Pages.MyAccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MyAccountSteps extends ScenarioSteps {

    private MyAccountPage onPage;

    @Step
    public void checkTextOnMyAccountPage () {
        onPage.checkTextOnMyAccountPage();
    }

    @Step
    public void clickOnWomenTab () {
        onPage.clickOnWomenTab();
    }

}

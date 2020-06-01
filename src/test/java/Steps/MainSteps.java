package Steps;

import Pages.MainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MainSteps extends ScenarioSteps {

    private MainPage onPage;

    @Step
    public void openMainPage () {
        onPage.openMainPage();
    }

    @Step
    public void clickOnSignInButton () {
        onPage.clickOnSignInButton();
    }

    @Step
    public void clickOnAddToCartButtonItemBlouse () {
        onPage.clickOnAddToCartButtonItemBlouse();
    }

    @Step
    public void clickOnMoreButtonItemBlouse () {
        onPage.clickOnMoreButtonItemBlouse();
    }

    @Step
    public void checkTextSuccessfullyAdded () {
        onPage.checkTextSuccessfullyAdded();
    }

    @Step
    public void clickOnCrossLayerCartIcon () {
        onPage.clickOnCrossLayerCartIcon();
    }

    @Step
    public void clickOnCartButton () {
        onPage.clickOnCartButton();
    }

}

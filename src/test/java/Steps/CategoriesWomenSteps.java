package Steps;

import Pages.CategoriesWomenPage;
import net.thucydides.core.steps.ScenarioSteps;

public class CategoriesWomenSteps extends ScenarioSteps {

    private CategoriesWomenPage onPage;

    public void checkTextOnCategoriesWomenPage () {
        onPage.checkTextOnCategoriesWomenPage();
    }

    public void clickOnAddToCartButtonItemBlouse () {
        onPage.clickOnAddToCartButtonItemBlouse();
    }

    public void checkTextSuccessfullyAdded () {
        onPage.checkTextSuccessfullyAdded();
    }

    public void clickOnCrossLayerCartIcon () {
        onPage.clickOnCrossLayerCartIcon();
    }

    public void clickOnCartButton () {
        onPage.clickOnCartButton();
    }

}

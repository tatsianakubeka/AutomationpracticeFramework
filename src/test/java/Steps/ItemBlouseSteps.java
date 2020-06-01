package Steps;

import Pages.ItemBlousePage;
import net.thucydides.core.steps.ScenarioSteps;

public class ItemBlouseSteps extends ScenarioSteps {

    private ItemBlousePage onPage;

    public void chooseSizeDropdown (String chooseSize) {
        onPage.chooseSizeDropdown(chooseSize);
    }

    public void chooseWhiteColour () {
        onPage.chooseWhiteColour();
    }

    public void clickOnAddToCartButton () {
        onPage.clickOnAddToCartButton();
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

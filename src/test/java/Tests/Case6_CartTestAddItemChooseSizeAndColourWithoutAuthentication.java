package Tests;

import org.junit.Test;

public class Case6_CartTestAddItemChooseSizeAndColourWithoutAuthentication extends SampleTest{

    @Test
    public void case6_CartTestAddItemChooseSizeAndColourWithoutAuthentication () {
        user.mainPage.openMainPage();
        user.mainPage.clickOnMoreButtonItemBlouse();
        user.itemBlousePage.chooseSizeDropdown("M");
        user.itemBlousePage.chooseWhiteColour();
        user.itemBlousePage.clickOnAddToCartButton();
        user.itemBlousePage.checkTextSuccessfullyAdded();
        user.itemBlousePage.clickOnCrossLayerCartIcon();
        user.itemBlousePage.clickOnCartButton();
        user.yourShoppingCartPage.checkProductBlouseName();
        user.yourShoppingCartPage.checkQuantityProductBlouse(1);
        user.yourShoppingCartPage.checkItemBlouseSizer("M");
        user.yourShoppingCartPage.checkItemBlouseColor("White");

    }
}

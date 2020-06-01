package Tests;

import org.junit.Test;

public class Case3_CartTestAddItemWithoutAuthentication extends SampleTest{

    @Test
    public void case3_CartTestAddItemWithoutAuthentication () {
        user.mainPage.openMainPage();
        user.mainPage.clickOnAddToCartButtonItemBlouse();
        user.mainPage.checkTextSuccessfullyAdded();
        user.mainPage.clickOnCrossLayerCartIcon();
        user.mainPage.clickOnCartButton();
        user.yourShoppingCartPage.checkProductBlouseName();
        user.yourShoppingCartPage.checkQuantityProductBlouse(1);
    }

}

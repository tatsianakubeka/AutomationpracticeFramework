package Tests;

import org.junit.Test;

public class Case4_CartTestIncreaseQuantityBy1WithoutAuthentication extends SampleTest {

    @Test
    public void case4_CartTestIncreaseQuantityBy1WithoutAuthentication () throws InterruptedException {
        user.mainPage.openMainPage();
        user.mainPage.clickOnAddToCartButtonItemBlouse();
        user.mainPage.checkTextSuccessfullyAdded();
        user.mainPage.clickOnCrossLayerCartIcon();
        user.mainPage.clickOnCartButton();
        user.yourShoppingCartPage.checkProductBlouseName();
        user.yourShoppingCartPage.checkQuantityProductBlouse(1);
        user.yourShoppingCartPage.increaseQuantityBy1ForProductBlouse();
        user.yourShoppingCartPage.checkQuantityProductBlouse(2);
    }

}

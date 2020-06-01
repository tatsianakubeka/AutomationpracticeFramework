package Tests;

import Helper.PropertiesHelper;
import org.junit.Test;

public class Case5_CartTestAddItemAuthenticationUser extends SampleTest{

    @Test
    public void case5_CartTestAddItemAuthenticationUser () {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.authenticationPage.checkTextOnAuthenticationPage();
        user.authenticationPage.fillInEmailAddressField(PropertiesHelper.INSTANCE.getProperty("email"));
        user.authenticationPage.fillInPasswordField(PropertiesHelper.INSTANCE.getProperty("password"));
        user.authenticationPage.clickOnSignInButtonOnAlreadyRegisteredForm();
        user.myAccountPage.checkTextOnMyAccountPage();
        user.myAccountPage.clickOnWomenTab();
        user.categoriesWomenPage.checkTextOnCategoriesWomenPage();
        user.categoriesWomenPage.clickOnAddToCartButtonItemBlouse();
        user.categoriesWomenPage.checkTextSuccessfullyAdded();
        user.categoriesWomenPage.clickOnCrossLayerCartIcon();
        user.categoriesWomenPage.clickOnCartButton();
        user.yourShoppingCartPage.checkProductBlouseName();
        user.yourShoppingCartPage.checkQuantityProductBlouse(1);
    }
}

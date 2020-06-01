package Tests;

import Helper.PropertiesHelper;
import org.junit.Test;

public class Case1_LoginTestWithValidEmailAndValidPassword extends SampleTest {

    @Test
    public void case1_LoginTestWithValidEmailAndValidPassword () {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.authenticationPage.checkTextOnAuthenticationPage();
        user.authenticationPage.fillInEmailAddressField(PropertiesHelper.INSTANCE.getProperty("email"));
        user.authenticationPage.fillInPasswordField(PropertiesHelper.INSTANCE.getProperty("password"));
        user.authenticationPage.clickOnSignInButtonOnAlreadyRegisteredForm();
        user.myAccountPage.checkTextOnMyAccountPage();
    }


}

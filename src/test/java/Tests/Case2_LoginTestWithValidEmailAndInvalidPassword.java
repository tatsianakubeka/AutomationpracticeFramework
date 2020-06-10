package Tests;

import Helper.PropertiesHelper;
import org.junit.Test;

public class Case2_LoginTestWithValidEmailAndInvalidPassword extends SampleTest {

    @Test
    public void case2_LoginTestWithValidEmailAndInvalidPassword() {
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignInButton();
        user.authenticationPage.checkTextOnAuthenticationPage();
        user.authenticationPage.fillInEmailAddressField(PropertiesHelper.INSTANCE.getProperty("email"));
        user.authenticationPage.fillInPasswordField(PropertiesHelper.INSTANCE.getProperty("passwordError"));
        user.authenticationPage.clickOnSignInButtonOnAlreadyRegisteredForm();
        user.authenticationPage.checkTextExistError();
        user.authenticationPage.checkTextInvalidPassword();
    }
}

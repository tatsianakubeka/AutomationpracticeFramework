package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthenticationPage extends BasePage {

    @FindBy (xpath = "//*[@id='create-account_form']/div/p")
    private WebElement createAnAccountText;

    @FindBy (id = "SubmitLogin")
    private WebElement signInButtonOnAlreadyRegisteredForm;

    @FindBy (id = "email")
    private WebElement emailAddressField;

    @FindBy (id = "passwd")
    private WebElement passwordField;

    @FindBy (xpath = "//*[@id='center_column']/p")
    private WebElement myAccountText;

    @FindBy (xpath = "//*[@id='center_column']/div/p")
    private WebElement existErrorText;

    @FindBy (xpath = "//*[@id='center_column']/div/ol/li")
    private WebElement invalidPasswordText;


    public AuthenticationPage (WebDriver driver) {
        super(driver);
    }

    public void checkTextOnAuthenticationPage () {
        String text = element(createAnAccountText).getText();
        Pattern pattern = Pattern.compile("(^Please\\senter\\s)");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Have found: TextOnAuthenticationPage");
        } else {
            System.out.println("Have not found: TextOnAuthenticationPage");
        }
    }

    public void fillInEmailAddressField (String email) {
        element(emailAddressField).sendKeys(email);
    }

    public void fillInPasswordField (String password) {
        element(passwordField).sendKeys(password);
    }

    public void clickOnSignInButtonOnAlreadyRegisteredForm () {
        element(signInButtonOnAlreadyRegisteredForm).click();
    }

    public void checkTextExistError () {
        String text = element(existErrorText).getText();
        Pattern pattern = Pattern.compile("(^There\\sis\\s1\\serror)");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Have found: TextExistErrow");
        } else {
            System.out.println("Have not found: TextExistErrow");
        }
    }

    public void checkTextInvalidPassword () {
        String text = element(invalidPasswordText).getText();
        Pattern pattern = Pattern.compile("Invalid password");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Have found: TextIvalidPassword");
        } else {
            System.out.println("Have not found: TextInvalidPassword");
        }
    }

}

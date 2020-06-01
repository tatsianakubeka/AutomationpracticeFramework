package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyAccountPage extends BasePage {

    @FindBy(xpath = "//*[@id='center_column']/p")
    private WebElement myAccountText;

    @FindBy(css = "a[title='Women']")
    private WebElement womenTab;


    public MyAccountPage (WebDriver driver) {
        super(driver);
    }

    public void checkTextOnMyAccountPage () {
        String text = element(myAccountText).getText();
        Pattern pattern = Pattern.compile("(^Welcome\\sto\\syour\\s)");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Have found: myAccountText");
        } else {
            System.out.println("Have not found: myAccountText");
        }
    }

    public void clickOnWomenTab () {
        element(womenTab).click();
    }


}

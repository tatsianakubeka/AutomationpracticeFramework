package Pages;

import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@DefaultUrl("http://automationpractice.com/index.php")
public class MainPage extends BasePage{

    @FindBy (css = "a.login")
    private WebElement signInButton;

    @FindBy (xpath = "//*[@id='center_column']/div[1]/ul[1]/li[2]")
    private WebElement listBlouse;

    @FindBy (id="layer_cart")
    private WebElement layerCart;

    @FindBy (xpath = "//*[@id='layer_cart']/div[1]/div[1]/span")
    private WebElement crossLayerCartIcon;

    @FindBy (css = "a[title='View my shopping cart']")
    private WebElement cartButton;


    public MainPage (WebDriver driver) {
        super(driver);
    }

    public void openMainPage () {
        open();
    }

    public void clickOnSignInButton () {
        element(signInButton).click();
    }

    public void clickOnAddToCartButtonItemBlouse () {
        withAction().moveToElement(listBlouse).perform();
        getDriver().findElement(By.cssSelector("a[title='Add to cart'][data-id-product='2']")).click();
    }

    public void clickOnMoreButtonItemBlouse() {
        withAction().moveToElement(listBlouse).perform();
        getDriver().findElement(By.cssSelector("a[href='http://automationpractice.com/index.php?id_product=2&controller=product'][title='View']")).click();
    }

    public void checkTextSuccessfullyAdded () {
        String text = element(layerCart).getText();
        Pattern pattern = Pattern.compile("Product successfully added to your shopping cart");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Have found: Product successfully added to your shopping cart");
        } else {
            System.out.println("Have not found: Product successfully added to your shopping cart");
        }
    }

    public void clickOnCrossLayerCartIcon () {
        element(crossLayerCartIcon).click();
    }

    public void clickOnCartButton () {
        element(cartButton).click();
    }

}

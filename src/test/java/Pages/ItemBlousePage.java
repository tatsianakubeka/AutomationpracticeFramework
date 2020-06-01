package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ItemBlousePage extends BasePage {

    @FindBy (id = "uniform-group_1")
    private WebElement sizeDropdown;

    @FindBy (id = "group_1")
    private WebElement size;

    @FindBy (id = "color_8")
    private WebElement whiteColor;

    @FindBy (id = "add_to_cart")
    private WebElement addToCartButton;

    @FindBy (id="layer_cart")
    private WebElement layerCart;

    @FindBy (xpath = "//*[@id='layer_cart']/div[1]/div[1]/span")
    private WebElement crossLayerCartIcon;

    @FindBy (css = "a[title='View my shopping cart']")
    private WebElement cartButton;


    public ItemBlousePage(WebDriver driver) {
        super(driver);
    }

    public void chooseSizeDropdown (String chooseSize) {
        element(sizeDropdown).click();
        selectFromDropdown(size,chooseSize);
    }

    public void chooseWhiteColour () {
        element(whiteColor).click();
    }

    public void clickOnAddToCartButton () {
        element(addToCartButton).click();
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

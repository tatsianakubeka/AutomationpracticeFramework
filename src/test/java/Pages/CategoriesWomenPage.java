package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CategoriesWomenPage extends BasePage{

    @FindBy (css = "span[class='category-name']")
    private WebElement categoryName;

    @FindBy (xpath = "//*[@class='rte']/p/strong")
    private WebElement text1categoryName;

    @FindBy (xpath = "//*[@class='rte']/p[2]")
    private WebElement text2categoryName;

    @FindBy (xpath = "//*[@class='rte']/p[3]")
    private WebElement text3categoryName;

    @FindBy (xpath = "//*[@id='center_column']/ul[1]/li[2]")
    private WebElement listBlouse;

    @FindBy (id="layer_cart")
    private WebElement layerCart;

    @FindBy (xpath = "//*[@id='layer_cart']/div[1]/div[1]/span")
    private WebElement crossLayerCartIcon;

    @FindBy (css = "a[title='View my shopping cart']")
    private WebElement cartButton;


    public CategoriesWomenPage(WebDriver driver) {
        super(driver);
    }

    public void checkTextOnCategoriesWomenPage () {
        String text = element(categoryName).getText();
        Assert.assertEquals("Women", text);
        text = element(text1categoryName).getText();
        Assert.assertEquals("You will find here all woman fashion collections.", text);
        text = element(text2categoryName).getText();
        Assert.assertEquals("This category includes all the basics of your wardrobe and much more:", text);
        text = element(text3categoryName).getText();
        Assert.assertEquals("shoes, accessories, printed t-shirts, feminine dresses, women's jeans!", text);
    }

    public void clickOnAddToCartButtonItemBlouse () {
        withAction().moveToElement(listBlouse).perform();
        getDriver().findElement(By.cssSelector("a[title='Add to cart'][data-id-product='2']")).click();
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

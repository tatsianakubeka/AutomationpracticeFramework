package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YourShoppingCartPage extends BasePage {

    @FindBy (xpath = "//*[contains(@id,'product_2_')]")
    private WebElement tableProductBlouse;

    @FindBy (css = "input[name='quantity_2_7_0_0_hidden']")
    private WebElement quantityProductBlouse;

    @FindBy (xpath = "//*[contains(@id,'cart_quantity_up_2_')]")
    private WebElement increaseBy1ButtonForBlouse;

    public YourShoppingCartPage (WebDriver driver) {
        super(driver);
    }

    public void checkProductBlouseName () {
        String text = element(tableProductBlouse).getText();
        Pattern pattern = Pattern.compile("Blouse");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Have found:  Blouse");
        } else {
            System.out.println("Have not found: Blouse");
        }
    }

    public void checkQuantityProductBlouse (int expectedValue) {
        String quantityValue = getDriver().findElement(By.xpath("//*[@type='hidden'][contains(@name,'quantity_2_')]")).getAttribute("value");
        Assert.assertEquals(Integer.toString(expectedValue), quantityValue);
    }

    public void increaseQuantityBy1ForProductBlouse () throws InterruptedException {
        element(increaseBy1ButtonForBlouse).click();
        Thread.sleep(5000);
    }

    public void checkItemBlouseSizer (String size) {
        String text = element(tableProductBlouse).getText();
        Pattern pattern = Pattern.compile("Size : " + size);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Have found: Size : " + size);
        } else {
            System.out.println("Have not found: Size : " + size);
        }
    }

    public void checkItemBlouseColor (String color) {
        String text = element(tableProductBlouse).getText();
        Pattern pattern = Pattern.compile("Color : " + color);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Have found: Color : " + color);
        } else {
            System.out.println("Have not found: Color : " + color);
        }
    }

}


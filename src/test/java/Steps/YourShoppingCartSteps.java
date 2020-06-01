package Steps;

import Pages.YourShoppingCartPage;
import net.thucydides.core.steps.ScenarioSteps;

public class YourShoppingCartSteps extends ScenarioSteps {

    private YourShoppingCartPage onPage;

    public void checkProductBlouseName () {
        onPage.checkProductBlouseName();
    }

    public void checkQuantityProductBlouse (int expectedValue) {
        onPage.checkQuantityProductBlouse(expectedValue);
    }

    public void increaseQuantityBy1ForProductBlouse () throws InterruptedException {
        onPage.increaseQuantityBy1ForProductBlouse();
    }

    public void checkItemBlouseSizer (String size) {
        onPage.checkItemBlouseSizer(size);
    }

    public void checkItemBlouseColor (String color) {
        onPage.checkItemBlouseColor(color);
    }

}

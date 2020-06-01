package Tests;

import Steps.MainSteps;
import Steps.MyAccountSteps;
import Steps.AuthenticationSteps;
import Steps.YourShoppingCartSteps;
import Steps.CategoriesWomenSteps;
import Steps.ItemBlouseSteps;
import net.thucydides.core.annotations.Steps;

public class User {

    @Steps
    public MainSteps mainPage;

    @Steps
    public AuthenticationSteps authenticationPage;

    @Steps
    public MyAccountSteps myAccountPage;

    @Steps
    public YourShoppingCartSteps yourShoppingCartPage;

    @Steps
    public CategoriesWomenSteps categoriesWomenPage;

    @Steps
    public ItemBlouseSteps itemBlousePage;

}
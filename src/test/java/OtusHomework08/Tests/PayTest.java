package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.CategoryPage;
import OtusHomework08.Helpers.Pages.HelpPage;
import OtusHomework08.Helpers.Pages.MainPage;
import OtusHomework08.Helpers.Pages.PayPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class PayTest extends BaseTests {

    @Autowired
    private MainPage mainPage;

    @Autowired
    private PayPage payPage;

    @Given("I'm on main page")
    public void openMainPage() {
        mainPage.init();
        mainPage.openMainPage();
    }

    @When("I click pay menu button")
    public void openPayMenu() {
        mainPage.clickHelpMenuButton();
        payPage.init();

    }

    @Then("I check open pay page")
    public void checkSliderBlock() {
        payPage.checkPayCategoryBlock();
    }
}

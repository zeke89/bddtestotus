package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.CategoryPage;
import OtusHomework08.Helpers.Pages.MainPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryTest extends BaseTests {

    @Autowired
    private MainPage mainPage;

    @Autowired
    private CategoryPage categoryPage;

    @Given("I'm on main page")
    public void openMainPage() {
        mainPage.init();
        mainPage.openMainPage();
    }

    @When("I click category menu button")
    public void openCategoryMenu() {
        mainPage.clickCategoryMenuButton();
        categoryPage.init();

    }

    @Then("I check open category page")
    public void checkSliderBlock() {
        categoryPage.checkSliderBlock();
    }
}
package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.MainPage;
import OtusHomework08.Helpers.Pages.SearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

public class CheckQuerySearchTest extends BaseTests {

    @Autowired
    private MainPage mainPage;

    @Autowired
    private SearchPage searchPage;

    @Given("I'm on main page")
    public void openMainPage() {
        mainPage.init();
        mainPage.openMainPage();
    }

    @When("I fill query and click enter")
    public void enterSearсhQuery() {
        mainPage.enterSearсhQuery("Справка об отсутствии судимости");
        searchPage.init();
    }

    @Then("I see one query result")
    public void foundSearchQuery() {
        searchPage.checkFoundServiceText("Получение справки о наличии " +
                "(отсутствии) судимости и (или) факта уголовного преследования либо о прекращении уголовного преследования");
    }
}

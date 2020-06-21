package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.MainPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class MainTest extends BaseTests {

    @Autowired
    private MainPage mainPage;

    @Given("I'm on main page")
    public void openMainPage() {
        mainPage.init();
        mainPage.openMainPage();
    }

    @Then("I check open main page")
    public void checkLogoOnMainPage() {
        mainPage.checkLogo();
    }
}

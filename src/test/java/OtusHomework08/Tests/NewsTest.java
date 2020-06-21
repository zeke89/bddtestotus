package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.MainPage;
import OtusHomework08.Helpers.Pages.NewsPage;
import OtusHomework08.Helpers.Pages.PayPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class NewsTest extends BaseTests {

    @Autowired
    private MainPage mainPage;

    @Autowired
    private NewsPage newsPage;

    @Given("I'm on main page")
    public void openMainPage() {
        mainPage.init();
        mainPage.openMainPage();
    }

    @When("I click news button")
    public void clickNewsButton() {
        mainPage.clickNewsButton();
        newsPage.init();
    }

    @Then("I check open news page")
    public void checkNewsBlock() {
        newsPage.checkNewsBlock();
    }
}

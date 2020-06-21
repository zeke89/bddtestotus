package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.MainPage;
import OtusHomework08.Helpers.Pages.SearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class ChangeLangTest extends BaseTests {

    @Autowired
    private MainPage mainPage;

    @Given("I'm on main page")
    public void openMainPage() {
        mainPage.init();
        mainPage.openMainPage();
    }

    @When("I click change lang button")
    public void clickChangeLangButton() {
        mainPage.clickLangSwitchButton();
    }

    @And("I choose gbr lang")
    public void chooseGbrLang() {
        mainPage.clickGbrLangButton();
    }

    @Then("I see site on gbr lang")
    public void checkGbrLangOnSite() {
        mainPage.checkTitle("Public Services Portal of the Russian Federation");
    }
}

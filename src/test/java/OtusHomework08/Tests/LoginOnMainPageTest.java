package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.LoginPage;
import OtusHomework08.Helpers.Pages.MainPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class LoginOnMainPageTest extends BaseTests {

    @Value("${email}")
    private String email;

    @Value("${password}")
    private String password;

    @Autowired
    private MainPage mainPage;

    @Autowired
    private LoginPage loginPage;

    @Given("I'm on login page")
    public void openLoginPage() {
        mainPage.init();
        mainPage.openMainPage();
        mainPage.clickLoginButton();
        loginPage.init();
    }

    @When("I fill login and password on form")
    public void enterLoginPasswordField() {
        loginPage.enterLogin(email);
        loginPage.enterPassword(password);
    }

    @And("I submit form")
    public void clickSubmitButton() {
        loginPage.clickSubmitButton();
    }

    @Then("I see profile name in header")
    public void checkLoginStatus() {
        loginPage.checkLoginStatus("Голубцов Е. С.");
    }
}

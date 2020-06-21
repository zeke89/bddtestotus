package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.LoginPage;
import OtusHomework08.Helpers.Pages.MainPage;
import OtusHomework08.Helpers.Pages.PayPage;
import OtusHomework08.Helpers.Pages.RecoveryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class RecoveryTest extends BaseTests {

    @Value("${email}")
    private String email;

    @Autowired
    private MainPage mainPage;

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private RecoveryPage recoveryPage;

    @Given("I'm on main page")
    public void openMainPage() {
        mainPage.init();
        mainPage.openMainPage();
    }

    @When("I click login button")
    public void openLoginPage() {
        mainPage.clickLoginButton();
        loginPage.init();
    }

    @And("I click recovery button")
    public void clickRecoveryButton() {
        loginPage.clickRecoveryButton();
        recoveryPage.init();
    }

    @And("I enter email and click submit")
    public void enterEmail() {
        recoveryPage.enterEmail(email);
        recoveryPage.clickSubmitButton();
    }

    @Then("I check open captcha block")
    public void checkCaptchaBlock() {
        recoveryPage.checkCaptchaForm();
    }
}

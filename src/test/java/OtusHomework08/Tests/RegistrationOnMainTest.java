package OtusHomework08.Tests;

import OtusHomework08.Helpers.Pages.MainPage;
import OtusHomework08.Helpers.Pages.RegistrationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class RegistrationOnMainTest extends BaseTests {

    @Value("${email}")
    private String email;

    @Value("${phone}")
    private String phone;

    @Value("${lastName}")
    private String lastName;

    @Value("${name}")
    private String name;

    @Autowired
    private MainPage mainPage;

    @Autowired
    private RegistrationPage registrationPage;

    @Given("I'm on registration page")
    public void openRegisterPage() {
        mainPage.init();
        mainPage.openMainPage();
        mainPage.clickRegistrationButton();
        registrationPage.init();
    }

    @When("I fill last name, name, phone and password on form")
    public void enterFieldsRegistrationForm() {
        registrationPage.enterLastName(lastName);
        registrationPage.enterName(name);
        registrationPage.enterPhone(phone);
        registrationPage.enterEmail(email);
    }

    @And("I submit form")
    public void clickSubmitButton() {
        registrationPage.clickSubmitButton();
    }

    @Then("I see code phone block")
    public void checkNextStepRegister() {
        registrationPage.checkRegisterStatus();
    }
}

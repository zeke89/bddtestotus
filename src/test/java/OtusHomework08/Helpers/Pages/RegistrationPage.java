package OtusHomework08.Helpers.Pages;

import OtusHomework08.Helpers.Drivers.ChromeWebDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class RegistrationPage extends BasePage {

    public void  init() {
        PageFactory.initElements(ChromeWebDriver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id = 'lastName']")
    private WebElement lastNameField;

    @FindBy(xpath = "//input[@id = 'name']")
    private WebElement nameField;

    @FindBy(xpath = "//input[@id = 'phone']")
    private WebElement phoneField;

    @FindBy(xpath = "//input[@id = 'email']")
    private WebElement emailField;

    @FindBy(xpath = "//button[@id = 'tryReg']")
    private WebElement submitButton;

    @FindBy(xpath = "//input[@id = 'code']")
    private WebElement codePhoneBlock;

    public void enterLastName(String lastName) {
        lastNameField.clear();
        lastNameField.sendKeys(lastName);
    }

    public void enterName(String name) {
        nameField.clear();
        nameField.sendKeys(name);
    }

    public void enterPhone(String phone) {
        phoneField.clear();
        phoneField.sendKeys(phone);
    }

    public void enterEmail(String email) {
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void checkRegisterStatus() {
        codePhoneBlock.isDisplayed();
    }
}

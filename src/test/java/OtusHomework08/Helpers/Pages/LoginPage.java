package OtusHomework08.Helpers.Pages;

import OtusHomework08.Helpers.Drivers.ChromeWebDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class LoginPage extends BasePage {

    public void init() {
        PageFactory.initElements(ChromeWebDriver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='mobileOrEmail']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@id='loginByPwdButton']")
    private WebElement submitButton;

    @FindBy(xpath = "//span[@id= 'login-name']")
    private WebElement userNameBlock;

    @FindBy(xpath = "//div[@class = 'field right recovery']/a")
    private WebElement recoveryButton;

    public void enterLogin(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void checkLoginStatus(String userName) {
        Assert.assertEquals("Check user name:", userNameBlock.getText(), userName);
    }

    public void clickRecoveryButton() {
        recoveryButton.click();
    }

}
package OtusHomework08.Helpers.Pages;

import OtusHomework08.Helpers.Drivers.ChromeWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class RecoveryPage extends BasePage {

    public void init() {
        PageFactory.initElements(ChromeWebDriver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@id = 'mobileOrEmail']")
    private WebElement emailInput;

    @FindBy(xpath = "//button[@id = 'searchMobileOrEmailBtn']")
    private WebElement submitButton;

    @FindBy(xpath = "//form[@id = 'captcha-form']")
    private WebElement captchaForm;


    public void enterEmail(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void checkCaptchaForm() {
        captchaForm.isDisplayed();
    }
}

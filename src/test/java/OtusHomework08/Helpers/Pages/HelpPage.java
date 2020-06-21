package OtusHomework08.Helpers.Pages;

import OtusHomework08.Helpers.Drivers.ChromeWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class HelpPage extends BasePage {

    public void init() {
        PageFactory.initElements(ChromeWebDriver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class = 'blue clearfix']")
    private WebElement helpCategoryBlock;

    public void checkHelpCategoryBlock() {
        helpCategoryBlock.isDisplayed();
    }
}

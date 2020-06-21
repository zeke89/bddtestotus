package OtusHomework08.Helpers.Pages;

import OtusHomework08.Helpers.Drivers.ChromeWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class PayPage extends BasePage {

    public void init() {
        PageFactory.initElements(ChromeWebDriver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class = 'grid-wrap__row flex-container justify-between ng-scope']")
    private WebElement payCategoryBlock;

    public void checkPayCategoryBlock() {
        payCategoryBlock.isDisplayed();
    }
}

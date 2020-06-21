package OtusHomework08.Helpers.Pages;

import OtusHomework08.Helpers.Drivers.ChromeWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.stereotype.Component;

@Component
public class NewsPage extends BasePage {

    public void init() {
        PageFactory.initElements(ChromeWebDriver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class = 'news-container']")
    private WebElement newsBlock;

    public void checkNewsBlock() {
        newsBlock.isDisplayed();
    }
}

package OtusHomework08.Helpers.Pages;

import OtusHomework08.Helpers.Drivers.ChromeWebDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.stereotype.Component;

@Component
public class SearchPage extends  BasePage {

    @FindBy(xpath = "//div[@class = 'services ng-scope']/span/a")
    private WebElement searchResult;

    public void init() {
        PageFactory.initElements(ChromeWebDriver.getDriver(), this);
    }

    public void checkFoundServiceText(String foundServiceText) {
        ChromeWebDriver.getWait().until(ExpectedConditions.visibilityOf(searchResult));
        Assert.assertEquals("Check result query:", searchResult.getText(), foundServiceText);
    }
}
package OtusHomework08.Helpers.Pages;

import OtusHomework08.Helpers.Drivers.ChromeWebDriver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainPage extends BasePage {

    @Value("${baseUrl}")
    protected String baseUrl;

    public void init() {
        PageFactory.initElements(ChromeWebDriver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id = '_epgu_el1']")
    private WebElement searchInput;

    @FindBy(xpath = "//div[@class = 'searchBox searchBox--main']/div/a")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@class = 'button-base button-long button-base--enter']")
    private WebElement loginButton;

    @FindBy(xpath = "//a[@id = 'reg']")
    private WebElement registrationButton;

    @FindBy(xpath = "//div[@class = 'catalog-on-main-trigger main-navigation__item ng-scope']")
    private WebElement categoryMenuButton;

    @FindBy(xpath = "//div[@class = 'main-navigation__item ng-scope'][1]")
    private WebElement payMenuButton;

    @FindBy(xpath = "//div[@class = 'main-navigation__item ng-scope'][2]")
    private WebElement helpMenuButton;

    @FindBy(xpath = "//div[@id = 'langCiviPicker']")
    private WebElement langSwitch;

    @FindBy(xpath = "//div[@class = 'civi-picker__selector-item js-selector-item  lang-picker-lang-gbr']")
    private WebElement gbrLang;

    @FindBy(xpath = "//div[@class = 'landing-header-title']")
    private WebElement title;

    @FindBy(xpath = "//a[@class = 'button-base button-medium button-blue']")
    private WebElement newsButton;

    @FindBy(xpath = "//a[@class = 'main-app-logo']")
    private WebElement logo;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void openMainPage(){
        ChromeWebDriver.getDriver().get(getBaseUrl());
    }

    public void enterSearсhQuery(String q) {
        searchInput.clear();
        searchInput.click();
        searchInput.sendKeys(q);
        ChromeWebDriver.getWait().until(ExpectedConditions.elementToBeClickable(searchButton));
        searchButton.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickRegistrationButton() {
        registrationButton.click();
    }

    public void clickCategoryMenuButton() {
        categoryMenuButton.click();
    }

    public void clickPayMenuButton() {
        payMenuButton.click();
    }

    public void clickHelpMenuButton() {
        helpMenuButton.click();
    }

    public void clickLangSwitchButton() {
        langSwitch.click();
    }

    public void clickGbrLangButton() {
        gbrLang.click();
    }

    public void checkTitle(String titleText) {
        Assert.assertEquals("Check title:", title.getText(), titleText);
    }

    public void clickNewsButton() {
        newsButton.click();
    }

    public void checkLogo() {
        logo.isDisplayed();
    }

//    public void openProfilePage() {
//        ChromeWebDriver.getWait().until(ExpectedConditions.visibilityOf(getUserName()));
//        ChromeWebDriver.getAction().moveToElement(getUserName()).perform();
//        getMyProfile().click();
//    }


}

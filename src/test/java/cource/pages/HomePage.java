package cource.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends Page {

    @FindBy(how = How.XPATH, using = "//*[@id=\"Email\"]")
    @CacheLookup
    public WebElement login;

    @FindBy(how = How.XPATH, using = "//*[@id=\"Passwd\"]")
    @CacheLookup
    public WebElement password;

    @FindBy(how = How.XPATH, using = "//*[@id=\"next\"]")
    @CacheLookup
    public WebElement nexButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"signIn\"]")
    @CacheLookup
    public WebElement sinGinButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\":2m\"]")
    @CacheLookup
    public WebElement settings;

    @FindBy(how = How.XPATH, using = "//*[@id=\":2t\"]/div[\"SK AX\"]")
    @CacheLookup
    public WebElement listOfSettings;

    @FindBy(how = How.XPATH, using = "//*[@id=\"gbwa\"]")
    @CacheLookup
    public WebElement apps;

    @FindBy(how = How.XPATH, using = "//*[@class=\"Dj\"]/b[1]")
    @CacheLookup
    public WebElement firsrNumber;

    @FindBy(how = How.XPATH, using = "//*[@class=\"Dj\"]/b[2]")
    @CacheLookup
    public WebElement secondNumber;

    @FindBy(how = How.XPATH, using = "//*[@class='AO']")
    @CacheLookup
    public WebElement mailTable;

    public HomePage(WebDriver webDriver) {
    super(webDriver);
  }

}

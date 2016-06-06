package cource.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Sample page
 */
public class HomePage extends Page {

  @FindBy(how = How.ID, using = "lst-ib")
  @CacheLookup
  public WebElement input;

  public HomePage(WebDriver webDriver) {
    super(webDriver);
  }
}

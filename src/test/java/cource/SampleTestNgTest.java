package cource;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cource.pages.HomePage;

import java.util.HashMap;
import java.util.Map;

public class SampleTestNgTest extends TestNgTestBase {

  private HomePage homepage;
  Map<String,String> selectorMap;
  @BeforeMethod
  public void initPageObjects() {
    homepage = PageFactory.initElements(driver, HomePage.class);


  }

  @Test
  public void loginPage() {
    driver.get(baseUrl);
    homepage.login.sendKeys("demyanenko.s.k");
    homepage.nexButton.click();
    homepage.password.sendKeys("===");
    homepage.sinGinButton.click();
  }
  @Test
  public void mailPage(){
    homepage.settings.click();
    Assert.assertEquals(homepage.listOfSettings.findElements(By.xpath("//*[@id=':2t']//*[@id=':2o' or @id=':2p' or @id=':2q' or @id='101:settings' or @id='ms' or @id='pbwc' or @id=':2r']")).size(),7);

  }
}

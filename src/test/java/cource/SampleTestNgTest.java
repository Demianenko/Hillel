package cource;

import cource.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleTestNgTest extends TestNgTestBase {
    private HomePage homepage;
    @BeforeMethod
    public void initPageObjects() throws InterruptedException {
        homepage = PageFactory.initElements(driver, HomePage.class);
        driver.get(baseUrl);
        Thread.sleep(2000);
        homepage.login.sendKeys("demyanenko.s.k");
        Thread.sleep(2000);
        homepage.nexButton.click();
        Thread.sleep(2000);
        homepage.password.sendKeys(" ");
        Thread.sleep(2000);
        homepage.sinGinButton.click();
    }

    @Test( enabled = false)
    public void settings() throws InterruptedException {
        homepage.settings.click();
        String xpath = "//*[@id=\":2t\"]/div[\"SK AX\"]/*[contains(@class,\'J-N\') and not(contains(@aria-hidden, \'true\'))]";
        List<WebElement> elemList =  homepage.listOfSettings.findElements(By.xpath(xpath));
        Assert.assertEquals(elemList.size(),7);
        for(WebElement e: elemList) {
            homepage.moveToElement(e);
            Thread.sleep(1000);
            Assert.assertTrue(e.getAttribute("class").contains("J-N-JT"));
        }
    }
    @Test ( enabled = true)
    public void apps() throws InterruptedException {
        homepage.apps.click();
        String xpath = "//*[@class='gb_O']/..";
        List<WebElement> elemList =  homepage.apps.findElements(By.xpath(xpath));
        Assert.assertEquals(homepage.apps.findElements(By.xpath(xpath)).size(),15);
        for(WebElement e: elemList) {
            homepage.moveToElement(e);
            System.out.print(e.getCssValue("border")+"--");
            Thread.sleep(1000);
            System.out.println(e.getCssValue("border"));
            //Assert.assertTrue(e.getAttribute("class").contains("J-N-JT"));
        }
    }
    @Test ( enabled = false)
    public void numbers() {
        Assert.assertEquals(homepage.firsrNumber.getText(),"1");
        Assert.assertEquals(homepage.secondNumber.getText(),"50");
    }
    @Test( enabled = false)
    public void table() {
        Assert.assertEquals(homepage.mailTable.findElements(By.xpath("//*[@class=\"zA yO\"]")).size(),50);
    }
    @AfterMethod
    public void quit(){
        driver.quit();
    }

}

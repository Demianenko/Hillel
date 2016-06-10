package cource;

import cource.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class SampleTestNgTest extends TestNgTestBase {
    private HomePage homepage;
    Map<String,String> selectorMap = new HashMap<String, String>();



    @BeforeMethod
    public void initPageObjects() throws InterruptedException {
        homepage = PageFactory.initElements(driver, HomePage.class);
        selectorMap.put("comfort","@id=':2o'");
        selectorMap.put("cosy","@id=':2p'");
        selectorMap.put("compact","@id=':2q'");
        selectorMap.put("conf","@id='101:settings'");
        selectorMap.put("settings","@id='ms'");
        selectorMap.put("themes","@id='pbwc'");
        selectorMap.put("help","@id=':2r'");

        driver.get(baseUrl);
        Thread.sleep(2000);
        homepage.login.sendKeys("demyanenko.s.k");
        Thread.sleep(2000);
        homepage.nexButton.click();
        Thread.sleep(2000);
        homepage.password.sendKeys("nonononono");
        Thread.sleep(2000);
        homepage.sinGinButton.click();
    }

    @Test( enabled = true)
    public void settings() {
        homepage.settings.click();
        Assert.assertEquals(homepage.listOfSettings.findElements(By.xpath("//*[@id=':2t']//*[" + selectorMap.get("comfort") +
                " or " + selectorMap.get("cosy") + " or " + selectorMap.get("compact") + " or " + selectorMap.get("conf") +
                " or " + selectorMap.get("settings") + " or " + selectorMap.get("themes") + " or " + selectorMap.get("help") + "]")).size(), 7);
    }
    @Test ( enabled = true)
    public void apps() {
        homepage.apps.click();
        Assert.assertEquals(homepage.apps.findElements(By.xpath("//*[@class=\"gb_O\"]")).size(),15);
    }
    @Test ( enabled = true)
    public void numbers() {
        Assert.assertEquals(homepage.firsrNumber.getText(),"1");
        Assert.assertEquals(homepage.secondNumber.getText(),"50");
    }
    @Test( enabled = true)
    public void table() {
        Assert.assertEquals(homepage.mailTable.findElements(By.xpath("//*[@class=\"zA yO\"]")).size(),50);
    }

}

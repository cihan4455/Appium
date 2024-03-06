package techproed.day08;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import techproed.basetest.TelefonBaseTest;

public class P01_Telephone_Arama extends TelefonBaseTest {
    @Test
    public void test01() throws InterruptedException {
        By keyPad = AppiumBy.accessibilityId("key pad");
        By bir = AppiumBy.accessibilityId("1,");
        By iki = AppiumBy.accessibilityId("2,ABC");
        By uc = AppiumBy.accessibilityId("3,DEF");
        By dort = AppiumBy.accessibilityId("4,GHI");
        By dial = AppiumBy.accessibilityId("dial");
       driver.findElement(keyPad).click();
       driver.findElement(bir).click();
       driver.findElement(bir).click();
       driver.findElement(dial).click();

       Thread.sleep(3000);
    }
}

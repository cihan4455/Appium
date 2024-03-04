package techproed.day06;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;

public class C07_ClickJest extends ApiDemosBaseTest {

    @Test
    public void testClickGesture() throws InterruptedException {

        WebElement os = driver.findElement(AppiumBy.accessibilityId("OS"));
//
        //driver.executeScript("mobile: clickGesture", ImmutableMap.of(
        //        "elementId", ((RemoteWebElement) os).getId()
        //));

        clickGesture(driver,os);
        Thread.sleep(3000);
    }

    @Test
    public void testClickGestureCoordinate() throws InterruptedException {

       //driver.executeScript("mobile: clickGesture", ImmutableMap.of(
       //        "x",740,
       //        "y",1088
       //));
       //Thread.sleep(3000);

        clickGesture(driver,300,400);
        Thread.sleep(3000);

    }




}

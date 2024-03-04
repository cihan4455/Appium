package techproed.day03;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class C05_TemelEylemler {
    @Test
    public void test01() throws MalformedURLException {
        String appUrl = System.getProperty("user.dir")
                + File.separator + "src"
                + File.separator + "test"
                + File.separator + "resources"
                + File.separator + "ApiDemos-debug.apk";

        UiAutomator2Options options = new UiAutomator2Options()
                .setUdid("emulator-5554")
                .setApp(appUrl)
                //.setAppPackage("io.appium.android.apis")
                //.setAppActivity("io.appium.android.apis.ApiDemos")
                ;
        //.setPlatformName("android")
        //.setAutomationName("uiautomator2");
        URL url = new URL("http://0.0.0.0:4723");
        AndroidDriver driver = new AndroidDriver(url, options);

        By app = AppiumBy.accessibilityId("App");
        By activity = AppiumBy.accessibilityId("Activity");
        By costomtitle = AppiumBy.accessibilityId("Custom Title");
        By lefttestbox = AppiumBy.id("io.appium.android.apis:id/left_text_edit");
        By righttestbox = AppiumBy.id("io.appium.android.apis:id/right_text_edit");
        By changeleftbuton = AppiumBy.accessibilityId("Change Left");
        By changerightbuton = AppiumBy.accessibilityId("Change Right");

        driver.findElement(app).click();
        driver.findElement(activity).click();
        driver.findElement(costomtitle).click();

        driver.findElement(lefttestbox).clear();
        driver.findElement(lefttestbox).sendKeys("cihan");
        driver.findElement(changeleftbuton).click();

        driver.findElement(righttestbox).clear();
        driver.findElement(righttestbox).sendKeys("karanfil");
        driver.findElement(changerightbuton).click();


    }
}

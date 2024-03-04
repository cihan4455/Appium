package techproed.day05pratice;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.basetest.MyDemoBaseTest;

import java.util.List;

public class P04_MyDemoApp_ColorTest extends MyDemoBaseTest {
              /*
              * 1. MyDemoApp uygulamasına gir
          2. Menüyü aç
          3. Login ol (bob@example.com, 10203040)
          4. Login butonuna tıkla
          5. İlk ürünü seç
          6. Renk olarak mavi seç
          7. Add To Cart butonuna tıkla
          8. Renk olarak kırmızı seç
          9. Add To Cart butonuna tıkla
          10. Sepete git
          11. Listede iki ürün olduğunu doğrla
          12. Listedeki ürünlerin mavi ve kırmızı olduğunu doğrula*/

    @Test
    public void testName() throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId("open menu")).click();

        WebElement menuItemLogin = driver.findElement(AppiumBy.accessibilityId("menu item log in"));
        menuItemLogin.click();

        WebElement userName = driver.findElement(AppiumBy.accessibilityId("Username input field"));
        userName.sendKeys("bob@example.com");

        WebElement password = driver.findElement(AppiumBy.accessibilityId("Password input field"));
        password.sendKeys("10203040");

        WebElement login = driver.findElement(AppiumBy.accessibilityId("Login button"));
        login.click();
        Thread.sleep(3000);
        WebElement product = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Sauce Labs Backpack\")"));
        product.click();

        //WebElement blueCircle = driver.findElement(AppiumBy.accessibilityId("blue circle"));
        By blueCircle = AppiumBy.accessibilityId("blue circle");
        driver.findElement(blueCircle).click();

        WebElement addToCartButton = driver.findElement(AppiumBy.accessibilityId("Add To Cart button"));
        addToCartButton.click();


       //WebElement redCircle = driver.findElement(AppiumBy.accessibilityId("red circle"));
        By redCircle = AppiumBy.accessibilityId("red circle");
        driver.findElement(redCircle).click();


        addToCartButton.click();

        WebElement cartbarge = driver.findElement(AppiumBy.accessibilityId("cart badge"));
        cartbarge.click();
        Thread.sleep(3000);

        List<WebElement> productRow = driver.findElements(AppiumBy.accessibilityId("product row"));
        Assert.assertEquals(productRow.size(), 2);

        Assert.assertTrue(driver.findElement(blueCircle).isDisplayed());
        Assert.assertTrue(driver.findElement(redCircle).isDisplayed());




    }
}

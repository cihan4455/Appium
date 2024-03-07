package techproed.day10;

import org.testng.annotations.Test;
import techproed.basetest.ApiDemosBaseTest;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Collections;


public class C01_PointerInput_Fling extends ApiDemosBaseTest {
    @Test
    public void test01() throws InterruptedException {
            driver.findElement(AppiumBy.accessibilityId("Views")).click();

            PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
            Sequence sequence = new Sequence(finger, 1)
                    .addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(),500,1500))
                    .addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()))
                    .addAction(new Pause(finger, Duration.ofMillis(200)))
                    .addAction(finger.createPointerMove(Duration.ofMillis(100), PointerInput.Origin.viewport(),500, 1000))
                    .addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

            driver.perform(Collections.singletonList(sequence));
            Thread.sleep(3000);
    }
}

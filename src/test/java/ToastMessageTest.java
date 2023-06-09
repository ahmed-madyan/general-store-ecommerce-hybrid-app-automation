import actions.MobileActions;
import assertions.Assert;
import driver_manager.DriverInitializer;
import io.appium.java_client.AppiumBy;
import mobile_gestures.MobileGestures;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ToastMessageTest extends DriverInitializer {
    private final By letsShop_btn = AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop");

    @Test
    public void validateToastMessage() {
        MobileGestures.click(letsShop_btn);
        Assert.assertTextToBe(MobileActions.getToastMessage(), "Please enter your name");
    }
}
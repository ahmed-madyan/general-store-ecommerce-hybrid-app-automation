package actions;

import driver_manager.DriverManager;
import waits.Waits;
import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.ScreenOrientation;

public class MobileActions {
    public static void startActivity(@NotNull final String appPackage, @NotNull final String appActivity) {
        try {
            DriverManager.getDriverInstance().startActivity(new Activity(appPackage.trim(), appActivity.trim()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void scrollIntoView(@NotNull final String elementText) {
        try {
            ElementActions.findElement(AppiumBy.ByAndroidUIAutomator.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + elementText + "\").instance(0))"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void scrollIntoElementView(@NotNull final By elementLocated, final String elementText) {
        try {
            ElementActions.findElement(AppiumBy.ByAndroidUIAutomator.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + elementText + "\").instance(0))"));
            Waits.fluentlyWait().visibilityOfElementLocated(elementLocated);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setClipboardText(@NotNull final String text) {
        try {
            DriverManager.getDriverInstance().setClipboardText(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getClipboardText() {
        String clipboardText = null;
        try {
            clipboardText = DriverManager.getDriverInstance().getClipboardText();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clipboardText;
    }

    public static void rotateRight() {
        try {
            DriverManager.getDriverInstance().rotate(new DeviceRotation(0, 0, 90));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void rotateLeft() {
        try {
            DriverManager.getDriverInstance().rotate(new DeviceRotation(0, 0, 270));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void rotateCustomAngle(@NotNull final int angle) {
        try {
            DriverManager.getDriverInstance().rotate(new DeviceRotation(0, 0, angle));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setPortraitMode() {
        try {
            DriverManager.getDriverInstance().rotate(ScreenOrientation.PORTRAIT);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setLandscapeMode() {
        try {
            DriverManager.getDriverInstance().rotate(ScreenOrientation.LANDSCAPE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getToastMessage() {
        String text = null;
        try {
            text = DriverManager.getDriverInstance().findElement(AppiumBy.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return text;
    }
}
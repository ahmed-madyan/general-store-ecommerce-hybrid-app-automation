package actions;

import driver_manager.DriverManager;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class KeyEvents {
    public static void keyEnter() {
        try {
            DriverManager.getDriverInstance().pressKey(new KeyEvent(AndroidKey.ENTER));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void keyHome() {
        try {
            DriverManager.getDriverInstance().pressKey(new KeyEvent(AndroidKey.HOME));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void keyBack() {
        try {
            DriverManager.getDriverInstance().pressKey(new KeyEvent(AndroidKey.BACK));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
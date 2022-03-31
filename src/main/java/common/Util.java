package common;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Util {
    public  AndroidDriver driver= Driver.getDriver();

    public final String gsmNumber = "555555555"; // put your gsm number
    public final String pinNumber = "1234"; // put the pin
    public final String password = "123456"; // put the password
    public final String payBillTextName = "Fatura Öde";
    public final String strListForOtherProcess = "com.turkcell.paycell.dev:id/fragment_menu_selection_rv";
    public final String turkcellTextName = "TURKCELL ILETISIM";
    public final String strListForPayBill = "com.turkcell.paycell.dev:id/fragment_invoice_corporation_type_rv_corporations";

    public void clickFunction(By element){
       WebDriverWait wait = new WebDriverWait(driver,30);
       wait.until(ExpectedConditions.visibilityOfElementLocated(element)).click();
    }
    public void putTextToTextbox(By element,String text){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(text);
    }
    public void scrollAndClick(String menuItemNameStr, String TextName) {
        AndroidElement androidElement = (AndroidElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"" + menuItemNameStr
                        + "\")).scrollIntoView(new UiSelector().text(\"" + TextName
                        + "\"))"));
        androidElement.click();
    }
    public void scrollDown(){
        Dimension dimension = driver.manage().window().getSize();
        int scrollStart = (int) (dimension.getHeight() * 0.9);
        int scrollEnd = (int) (dimension.getHeight() * 0.2);
        int scrollMiddle = (int) (dimension.getWidth()/2);
        AndroidTouchAction actions;
        actions = new AndroidTouchAction(driver)
                .press(PointOption.point(scrollMiddle, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(scrollMiddle, scrollEnd))
                .release()
                .perform();
    }
}

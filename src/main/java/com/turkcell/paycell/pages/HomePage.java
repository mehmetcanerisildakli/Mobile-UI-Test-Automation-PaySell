package com.turkcell.paycell.pages;

import common.Util;
import org.openqa.selenium.By;

public class HomePage {
    private final By otherProcessButton=By.xpath("//android.view.ViewGroup[9]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView");
    Util util;

    public void otherProcessButtonClick(){ util.clickFunction(this.otherProcessButton); }
}

package com.turkcell.paycell.pages;

import common.Util;
import org.openqa.selenium.By;

public class BillPayPage {
    Util util;
    private final By billSearchTextbox = By.id("edt_input");
    private final By okToSearchButton = By.id("button_query_bill");
    private final By registeredPayBillButton = By.id("layout_value");

    public void scrollAndClickTurkcellCommunication() {
        util.scrollAndClick(util.strListForPayBill, util.turkcellTextName);
    }

    public void putGsmNumberToSearchBill() {
        util.putTextToTextbox(this.billSearchTextbox, util.gsmNumber);
    }

    public void okToSearchButtonClick() {
        util.clickFunction(this.okToSearchButton);
    }

    public void registeredPayBillButtonClick() {
        util.clickFunction(this.registeredPayBillButton);
    }
}
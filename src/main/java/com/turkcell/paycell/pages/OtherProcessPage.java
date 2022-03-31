package com.turkcell.paycell.pages;

import common.Util;

public class OtherProcessPage {
    Util util;

    public void scrollAndClickPayBill(){
        util.scrollAndClick(util.strListForOtherProcess, util.payBillTextName);
    }

}

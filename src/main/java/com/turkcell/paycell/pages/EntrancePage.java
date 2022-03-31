package com.turkcell.paycell.pages;

import common.Util;
import org.openqa.selenium.By;

public class EntrancePage {
    Util util=new Util();
    private final By continueButton =By.id("btn_next_one");
    private final By phoneNumberInsertBox=By.id("et_input");
    private final By numberGoButton=By.id("fragment_phone_number_go_btn");
    private final By pinNumberInsertBox=By.id("edt_otp");
    private final By passNumberInsertBox=By.id("et_input");

    public void continueButtonClick(){
        util.clickFunction(this.continueButton);
    }
    public void phoneNumberInsertion(){ util.putTextToTextbox(this.phoneNumberInsertBox, util.gsmNumber); }
    public void numberGoButtonClick(){
        util.clickFunction(this.numberGoButton);
    }
    public void pinNumberInsertion(){
        util.putTextToTextbox(this.pinNumberInsertBox, util.pinNumber);
    }
    public void passNumberInsertion(){ util.putTextToTextbox(this.passNumberInsertBox, util.password); }

}

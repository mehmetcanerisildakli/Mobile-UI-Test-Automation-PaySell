import common.Driver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.turkcell.paycell.pages.*;

public class PhoneBillPay {
    static Driver driver =new Driver();
    EntrancePage entrancePage =new EntrancePage();
    HomePage homePage;
    OtherProcessPage otherProcessPage;
    BillPayPage billPayPage;


    @BeforeTest
    public void setUp(){
        driver.setUp();
    }
    @Test
    public void billPayTest(){
        entrancePage.continueButtonClick();
        entrancePage.phoneNumberInsertion();
        entrancePage.numberGoButtonClick();
        entrancePage.pinNumberInsertion();
        entrancePage.passNumberInsertion();
        homePage.otherProcessButtonClick();
        otherProcessPage.scrollAndClickPayBill();
        billPayPage.scrollAndClickTurkcellCommunication();
        billPayPage.putGsmNumberToSearchBill();
        billPayPage.okToSearchButtonClick();
        billPayPage.registeredPayBillButtonClick();
    }

    @AfterTest
    public void driverDown(){
        driver.tearDown();
    }

}

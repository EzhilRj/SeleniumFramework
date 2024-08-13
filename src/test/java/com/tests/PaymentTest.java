package com.tests;

import com.tmb.Annotations.FrameworkAnnotations;
import com.tmb.Utils.DataProviderUtils;
import com.tmb.pages.LoginPage;
import com.tmb.testdata.TestData;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.tmb.Reports.ExtentLogger.category;

public class PaymentTest extends BaseTest {


/*    @FrameworkAnnotations
    @Test(description = "Payment Test Login Test Clone",dataProvider = "getData", dataProviderClass = DataProviderUtils.class)
    public void paymentTest(TestData data)  {
        category("Smoke");
        LoginPage lg = new LoginPage();
        String actualtitle = lg.loginintoApplication(data.username,data.password).getHomepagetitle();
        Assert.assertEquals(actualtitle,data.expectedtitle);
    }*/

    @FrameworkAnnotations
    @Test(description = "Payment Test Login Test Clone")
    public void paymentTest()  {
        category("Smoke");
        LoginPage lg = new LoginPage();
        String actualtitle = lg.loginintoApplication("Admin","admin123").getHomepagetitle();
        Assert.assertEquals(actualtitle,"OrangeHRM");
    }



}

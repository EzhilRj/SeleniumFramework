package com.tests;

import com.tmb.Annotations.FrameworkAnnotations;
import com.tmb.Constants.FrameworkConstants;
import com.tmb.Driver.Driver;
import com.tmb.Driver.DriverManager;
import com.tmb.Utils.DataProviderUtils;
import com.tmb.pages.HomePage;
import com.tmb.pages.LoginPage;
import com.tmb.testdata.TestData;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static com.tmb.Reports.ExtentLogger.author;
import static com.tmb.Reports.ExtentLogger.category;


public class HomePageTest extends BaseTest{

/*    @FrameworkAnnotations
    @Test(description = "Check the LoginPage in OrangeHRM Website",dataProvider = "getData", dataProviderClass = DataProviderUtils.class)
    public void titleValidation_Test(TestData data){
        category("Smoke","Regression");
        LoginPage lg = new LoginPage();
        String actualtitle = lg.loginintoApplication(data.username,data.password).getHomepagetitle();
        Assert.assertEquals(actualtitle,data.expectedtitle);

    }*/

    @FrameworkAnnotations
    @Test(description = "Check the LoginPage in OrangeHRM Website")
    public void titleValidation_Test(){
        category("Smoke","Regression");
        LoginPage lg = new LoginPage();
        String actualtitle = lg.loginintoApplication("Admin","admin123").getHomepagetitle();
        Assert.assertEquals(actualtitle,"OrangeHRM");

    }
}

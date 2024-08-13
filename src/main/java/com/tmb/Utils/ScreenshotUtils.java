package com.tmb.Utils;

import com.tmb.Driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtils {

    private ScreenshotUtils(){}

    public  static  String getScreenshot(){
        return ((TakesScreenshot) DriverManager.getdriver()).getScreenshotAs(OutputType.BASE64);
    }
}

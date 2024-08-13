package com.tmb.Reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.tmb.Utils.ScreenshotUtils;

public final class ExtentLogger {

    private ExtentLogger(){}

    public static void pass(String message){
        ExtentManager.getExtentTest().pass(message);
    }

    public static void fail(String message){
        ExtentManager.getExtentTest().fail(message);
        ExtentManager.getExtentTest().fail(message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getScreenshot()).build());
    }

    public static void info(String message){
        ExtentManager.getExtentTest().info(message);
    }

    public static void author(String message){
        ExtentManager.getExtentTest().assignAuthor(message);
    }

    public static void category(String cat1,String...cat2){
        ExtentManager.getExtentTest().assignCategory(cat1).assignCategory(cat2);
    }




}

package com.tmb.Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.tmb.Constants.FrameworkConstants;

import static com.tmb.Constants.FrameworkConstants.reportpath;

public final class ExtentReport {

    private ExtentReport(){}

    public static  ExtentSparkReporter spark;
    public static ExtentReports extent;
    public static ExtentTest test;

    public static void initReports(){
        extent = new ExtentReports();
        spark = new ExtentSparkReporter(reportpath);
        extent.attachReporter(spark);
    }

    public static void flushreport(){
        extent.flush();
    }

    public static void createtest(String testcasename){
        test = extent.createTest(testcasename);
        ExtentManager.setExtentTest(test);

    }
}

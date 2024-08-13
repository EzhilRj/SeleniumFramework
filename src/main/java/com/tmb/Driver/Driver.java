package com.tmb.Driver;

import com.tmb.Config.ConfigFactory;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public final class Driver {

    private Driver(){}

    private static WebDriver driver;

    public static void initDriver() throws MalformedURLException {

        String browser = ConfigFactory.getconfig().browser();
        String runmode = ConfigFactory.getconfig().runmode();
        if(DriverManager.getdriver()==null){
            driver= DriverFactory.getdriver(runmode,browser);
            DriverManager.setdriver(driver);
        }
        DriverManager.getdriver().manage().window().maximize();
        DriverManager. getdriver().manage().timeouts().implicitlyWait(ConfigFactory.getconfig().timeout(), TimeUnit.SECONDS);
        DriverManager. getdriver().get(ConfigFactory.getconfig().appurl());

    }

    public static void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        if(DriverManager.getdriver()!=null){
            DriverManager.getdriver().quit();
        }

    }




}

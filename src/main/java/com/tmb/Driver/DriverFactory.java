package com.tmb.Driver;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

import static com.tmb.Driver.RemoteDriverFactory.getremotedriver;

public class DriverFactory {

    public static WebDriver getdriver(String runmode, String browsername) throws MalformedURLException {

        WebDriver driver = null;

        if(runmode.equalsIgnoreCase("Local")){

            driver = LocalDriverFactory.getLocalDriver(browsername);

        } else if (runmode.equalsIgnoreCase("Remote")) {

           driver =  getremotedriver(browsername);
        }
        return driver;
    }

}

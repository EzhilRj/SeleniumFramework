package com.tmb.Driver;

import com.tmb.Config.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public final  class RemoteDriverFactory {

    private  RemoteDriverFactory() {}


    public static RemoteWebDriver getremotedriver(String browsername) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        if(browsername.equalsIgnoreCase("Chrome")){
            capabilities.setBrowserName("Chrome");
        } else if (browsername.equalsIgnoreCase("firefox")) {
            capabilities.setBrowserName("firefox");
        } else if (browsername.equalsIgnoreCase("Edge")) {
            capabilities.setBrowserName("Edge");
        }

       return new RemoteWebDriver(new URL(ConfigFactory.getconfig().remoteurl()),capabilities);

    }
}

package com.tmb.Utils;

import com.tmb.Config.ConfigFactory;
import com.tmb.Driver.DriverManager;
import com.tmb.Enums.WaitType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {

    public static void click(By by, WaitType waitType){
        WebElement element = null;
        if(waitType==WaitType.PRESENCE){
            element = waitUntilElementisPresent(by);
        } else if (waitType==WaitType.CLICKABLE) {
            element =    waitUntilElementisClickable(by);
        }else if (waitType==WaitType.VISIBLE){
            element =  waitUntilElementisVisible(by);
        }
        element.click();
    }

    public static void enter(By by,String value){
        WebElement element= waitUntilElementisPresent(by);
        element.sendKeys(value);
    }

    private static WebElement waitUntilElementisPresent(By by){
        WebDriverWait wait = new WebDriverWait(DriverManager.getdriver(), ConfigFactory.getconfig().timeout());
        return   wait.until(ExpectedConditions.presenceOfElementLocated(by));

    }

    private static WebElement waitUntilElementisClickable(By by){
        WebDriverWait wait = new WebDriverWait(DriverManager.getdriver(), ConfigFactory.getconfig().timeout());
        return   wait.until(ExpectedConditions.elementToBeClickable(by));

    }


    private static WebElement waitUntilElementisVisible(By by){
        WebDriverWait wait = new WebDriverWait(DriverManager.getdriver(), ConfigFactory.getconfig().timeout());
        return   wait.until(ExpectedConditions.visibilityOfElementLocated(by));

    }

}

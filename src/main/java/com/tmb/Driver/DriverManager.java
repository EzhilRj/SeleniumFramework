package com.tmb.Driver;

import org.openqa.selenium.WebDriver;

public final  class DriverManager {

    private DriverManager(){}

    private static final  ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public static WebDriver getdriver() {
        return threadLocal.get();
    }

    public static void setdriver(WebDriver driver) {
        threadLocal.set(driver);
    }
}

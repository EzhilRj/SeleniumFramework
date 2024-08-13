package com.tmb.pages;

import com.tmb.Enums.WaitType;
import com.tmb.Reports.ExtentLogger;
import com.tmb.Reports.ExtentManager;
import org.openqa.selenium.By;

import static com.tmb.Utils.SeleniumUtils.click;
import static com.tmb.Utils.SeleniumUtils.enter;

public class LoginPage {

    private static final  By TXTBOXUSERNAME = By.name("username");
    private static final By TXTBOXPASSWORD =  By.name("password");
    private static final By BTNLOGIN = By.xpath("//*[text()=' Login ']");

    private LoginPage setUsername(String username) {
        enter(TXTBOXUSERNAME,username);
        ExtentLogger.pass("Username entered Successfully");
        return  this;
    }

    private LoginPage setPassword(String password) {
        enter(TXTBOXPASSWORD,password);
        ExtentLogger.pass("Password entered Successfully");
        return this;
    }

    private HomePage setLogin() {
        click(BTNLOGIN, WaitType.CLICKABLE);
        ExtentLogger.info("Login Button Is Clicked");
        return new HomePage();    //page chaining
    }

    public HomePage loginintoApplication(String username, String password) {
        return setUsername(username).setPassword(password).setLogin();      //Page chaining
    }
}

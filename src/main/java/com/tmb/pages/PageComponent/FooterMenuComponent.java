package com.tmb.pages.PageComponent;

import com.tmb.Driver.DriverManager;
import org.openqa.selenium.By;

public class FooterMenuComponent {

    private final By version = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-copyright'][1]");

    public String getversion(){
       return DriverManager.getdriver().findElement(version).getText();
    }
}

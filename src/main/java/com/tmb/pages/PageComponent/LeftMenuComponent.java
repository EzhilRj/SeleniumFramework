package com.tmb.pages.PageComponent;

import com.tmb.Driver.DriverManager;
import com.tmb.Enums.WaitType;
import com.tmb.Utils.SeleniumUtils;
import org.openqa.selenium.By;

import static com.tmb.Utils.SeleniumUtils.click;

public class LeftMenuComponent {


    private final By admin = By.xpath("//*[@href=\"/web/index.php/admin/viewAdminModule\"]");

    public void clickadmin(){
        click(admin, WaitType.CLICKABLE);
    }

}

package com.tmb.pages;

import com.tmb.Driver.DriverManager;
import com.tmb.pages.PageComponent.FooterMenuComponent;
import com.tmb.pages.PageComponent.LeftMenuComponent;

public class HomePage {

    private LeftMenuComponent leftMenuComponent;
    private FooterMenuComponent footerMenuComponent;

    public HomePage() {
        this.leftMenuComponent = new LeftMenuComponent();
        this.footerMenuComponent = new FooterMenuComponent();
    }


    public String getHomepagetitle(){
        return DriverManager.getdriver().getTitle();
    }

    public void clickonAdmin(){
        leftMenuComponent.clickadmin();
    }

    public String getversion(){
        return footerMenuComponent.getversion();
    }


}

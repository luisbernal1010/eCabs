package com.stgautomation.pages;

import org.openqa.selenium.By;

public class HomeeCabs extends BasePage{

    private By logoeCabs = By.xpath("//img[@alt='Cuorium logo']");

    public boolean islogoeCabsDisplayed(){
        return find(logoeCabs).isDisplayed();
    }

}

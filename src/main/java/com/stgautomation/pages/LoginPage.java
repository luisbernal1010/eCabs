package com.stgautomation.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

    private By username = By.id("username");
    private By password = By.id("password");
    private By loginbutton = By.xpath("//span[text()='Login']");
    private By errormessage = By.xpath("//p[text()='Unable to authenticate'");

    public void setUsername (String username1){
        set(username, username1);
    }
    public void setPassword (String password1){
        set(password, password1);
    }

    public HomeeCabs ClickLoginButton(){
        click(loginbutton);
        return new HomeeCabs();
    }

    public HomeeCabs LoginIntoApplication (String username1, String password1){
        setUsername(username1);
        setPassword(password1);
        return ClickLoginButton();
    }

    public String getErrorMessage (){
        return find(errormessage).getText();
    }


}

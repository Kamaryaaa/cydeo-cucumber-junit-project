package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {




    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(name = "username")
    public WebElement userName;


@FindBy(name = "password")
    public WebElement password;


@FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;






    /**
     * this method can log in with below credentials
     * @username : Test
     * @password : Tester
     */
    public void login(){
    this.userName.sendKeys("Test");
    this.password.sendKeys("Tester");
    this.loginButton.click();
}

    /**
     * this method will log in with credentials with provided in paramater
     * @username user
     * @password pass
     */

public void login(String user, String pass){
    this.userName.sendKeys(user);
    this.password.sendKeys(pass);
    this.loginButton.click();
}









}

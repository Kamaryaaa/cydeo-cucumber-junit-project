package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableOrderPage extends WebTableBasePage {


    public WebTableOrderPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(name = "product")
    public WebElement productDropDown;


    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement visaRadioButton;

    @FindBy(xpath = "//input[@value='MasterCard']")
    public WebElement masterCardRadioButton;

    @FindBy(xpath = "//input[@value='American Express']")
    public WebElement americanExpressRadioButton;


}

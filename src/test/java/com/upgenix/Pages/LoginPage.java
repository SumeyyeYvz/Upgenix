package com.upgenix.Pages;

import com.upgenix.Utilities.ConfigurationReader;
import com.upgenix.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id="login")
    public WebElement usernameBox;

    @FindBy(id="password")
    public WebElement passwordBox;

    @FindBy(xpath ="//*[@class='btn btn-primary']")
    public WebElement signinButton;

    public void Login(){
        usernameBox.sendKeys(ConfigurationReader.get("username"));
        passwordBox.sendKeys(ConfigurationReader.get("password"));
        signinButton.click();
    }
    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }
}

package com.vytrack.pages;

import com.vytrack.task_test.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @CacheLookup
    @FindBy(id = "prependedInput")
    public WebElement usernameInput;

    @CacheLookup
    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @CacheLookup
    @FindBy(id = "_submit")
    public WebElement loginBtn;

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    public void loginAsStoreManager(){
        usernameInput.sendKeys(ConfigurationReader.get("storemanager_username"));
        passwordInput.sendKeys(ConfigurationReader.get("storemanager_password"));
        loginBtn.click();
    }


}

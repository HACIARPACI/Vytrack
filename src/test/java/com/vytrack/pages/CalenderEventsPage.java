package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;
import java.util.List;

public class CalenderEventsPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'Options')]")
    public WebElement options;

    @FindBy(xpath = "//ul[@class='icons-holder']//input")
    public WebElement pageNumber;

    @FindBy(xpath = "//button[@class=\"btn dropdown-toggle \"]")
    public WebElement viewPerPage;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement viewPerPage25;

    @FindBy(xpath = "//label[contains(text(),'Total of')]")
    public WebElement numberOfRecordsOfEvents;

    @FindBy(xpath = "(//button[@class='btn btn-default btn-small dropdown-toggle'])[3]/input")
    public WebElement selectAllCheckBox;

    @FindBy(css = "i.fa-filter.hide-text")
    public WebElement filterBtn;

    @FindBy(xpath = "//div[contains(text(),'Title')]")
    public WebElement titleBtn;

    @FindBy (xpath = "//input[@name ='value']")
    public WebElement textBox;

    @FindBy (css = "table>tbody>tr")
    public List<WebElement> numOfRows;


    public String numberOfRecords(String sendKeys){

       // filterBtn.click();
        BrowserUtils.waitForClickablility(filterBtn,5).click();
       // titleBtn.click();
        BrowserUtils.waitForClickablility(titleBtn,5).click();

        textBox.sendKeys(sendKeys + Keys.ENTER);
        BrowserUtils.waitFor(5);

        return numOfRows.size() + "";

    }

}

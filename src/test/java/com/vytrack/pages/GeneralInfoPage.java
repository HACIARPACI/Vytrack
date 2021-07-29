package com.vytrack.pages;
import com.vytrack.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public class GeneralInfoPage extends BasePage {
    @FindBy(xpath = "//div[@class='control-group attribute-row']/label")
    public List<WebElement> headers;

    @FindBy(xpath = "(//div[@class='controls']/div[@class='control-label'])[1]")
    public WebElement titleValue;

    @FindBy(xpath = "(//div[@class='control-group attribute-row']/div/div)[2]/p/span")
    public WebElement descriptionValue;

    @FindBy(xpath = "(//div[@class='controls']/div[@class='control-label'])[2]")
    public WebElement startValue;

    @FindBy(xpath = "(//div[@class='controls']/div[@class='control-label'])[3]")
    public WebElement endValue;

    @FindBy(xpath = "(//div[@class='controls']/div[@class='control-label'])[4]")
    public WebElement allDayEventValue;

    @FindBy(xpath = "(//div[@class='controls']/div[@class='control-label'])[5]//a")
    public WebElement organizerValue;

    @FindBy(xpath = "(//div[@class='controls']/div[@class='control-label'])[6]")
    public WebElement callViaHangoutValue;

    public Map<String,String> getGeneralInfo(){
        Map <String,String > generalInfo=new LinkedHashMap<>();
        generalInfo.put(BrowserUtils.getElementsText(headers).get(0),titleValue.getText());
        generalInfo.put(BrowserUtils.getElementsText(headers).get(1),descriptionValue.getAttribute("innerHTML").trim());
        generalInfo.put(BrowserUtils.getElementsText(headers).get(2),startValue.getText());
        generalInfo.put(BrowserUtils.getElementsText(headers).get(3),endValue.getText());
        generalInfo.put(BrowserUtils.getElementsText(headers).get(4),allDayEventValue.getText());
        generalInfo.put(BrowserUtils.getElementsText(headers).get(5),organizerValue.getText());
        generalInfo.put(BrowserUtils.getElementsText(headers).get(6),callViaHangoutValue.getText());

        return generalInfo;
    }
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class wikipediaSearch {

    public wikipediaSearch(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@type=\"search\"]")
    public WebElement searchbox;
    @FindBy(xpath = "//*[@id=\"searchform\"]/div/button")
    public WebElement searchButton;;



}

package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.wikipediaSearch;
import utilities.ConfigurationReader;
import utilities.Driver;

public class wikipediaStepDefinition {
    wikipediaSearch wikipediaSearch = new wikipediaSearch();


    @Given("user is on the wikipedia main page")
    public void user_is_on_the_wikipedia_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("wikiUrl"));

    }
    @When("user searches for fungus")
    public void user_searches_for_fungus() {
        wikipediaSearch.searchbox.sendKeys("fungus");
  }
    @When("user clicks seacrh button")
    public void user_clicks_seacrh_button() {
        wikipediaSearch.searchButton.click();
 }
    @Then("user should see fungus on the title")
    public void user_should_see_fungus_on_the_title() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleIs("Fungus-Wikipedia"));

        String expectedtitle ="Fungus-Wikipedia";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println("actualTitle = " + actualTitle);
        Assert.assertEquals("Title did not match",actualTitle.contains("Fungus"));


}

}

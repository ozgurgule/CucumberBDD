package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;

public class LoginStepDefinition {

   LoginPage loginPage = new LoginPage();
    @Given("user is on login page")
    public void user_is_on_login_page() {
String url = ConfigurationReader.getProperty("crm_url");
        Driver.getDriver().get(url);
    }
    @When("Hr enters username")
    public void hr_enters_username() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("crm_username"));

    }
    @When("Hr enters password")
    public void hr_enters_password() {
loginPage.password.sendKeys(ConfigurationReader.getProperty("crm_password"));
    }
    @When("Hr clicks login button")
    public void hr_clicks_login_button() {
        loginPage.loginButton.click();

    }
    @Then("Hr should see dashboard")
    public void hr_should_see_dashboard() {
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleIs("Company Structure"));

        String expectedTitle = "Company Structure";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        assertEquals("Title did not match",expectedTitle,actualTitle);


    }




}

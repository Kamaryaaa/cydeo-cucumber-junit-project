package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.pages.WebTableOrderPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTableLogin_StepDefinitions {
    WebTableLoginPage webTableLoginPage=new WebTableLoginPage();

    @Given("user on the webTable login page")
    public void user_on_the_web_table_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webTableURL"));
    }
    @Then("user enter username Test")
    public void user_enter_username_test() {
        webTableLoginPage.userName.sendKeys("Test");
    }
    @Then("user enter password Tester")
    public void user_enter_password_tester() {
        webTableLoginPage.password.sendKeys("Tester");
    }
    @Then("user see the url ends with orders")
    public void user_see_the_url_ends_with_orders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }


    @And("user click the login button")
    public void userClickTheLoginButton() {
        webTableLoginPage.loginButton.click();
    }

    @Then("user enter username {string}")
    public void userEnterUsername(String username) {
        webTableLoginPage.userName.sendKeys(username);
    }

    @And("user enter password {string}")
    public void userEnterPassword(String password) {
        webTableLoginPage.password.sendKeys(password);

    }

    @Given("user is already logged in to The Web table app")
    public void user_is_already_logged_in_to_the_web_table_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("webTableURL"));
        webTableLoginPage.login();

    }
    WebTableOrderPage webTableOrderPage=new WebTableOrderPage();
    @When("user is on the “Order” page")
    public void user_is_on_the_order_page() {
        webTableOrderPage.orderLink.click();

    }
    @Then("user sees below options under “product” dropdown")
    public void user_sees_below_options_under_product_dropdown(List<String> expectedOptions) {
           List<String> actualOptions = BrowserUtils.dropdownOptions_as_STRING(webTableOrderPage.productDropDown);
           Assert.assertEquals(expectedOptions,actualOptions);

    }


    @Then("user sees visa as enabled payment option")
    public void userSeesVisaAsEnabledPaymentOption() {
     Assert.assertTrue(webTableOrderPage.visaRadioButton.isEnabled());
    }

    @Then("user sees MasterCard as enabled payment option")
    public void userSeesMasterCardAsEnabledPaymentOption() {
        Assert.assertTrue(webTableOrderPage.masterCardRadioButton.isEnabled());
    }

    @Then("user sees American Express as enabled payment option")
    public void userSeesAmericanExpressAsEnabledPaymentOption() {
        Assert.assertTrue(webTableOrderPage.americanExpressRadioButton.isEnabled());
    }
}

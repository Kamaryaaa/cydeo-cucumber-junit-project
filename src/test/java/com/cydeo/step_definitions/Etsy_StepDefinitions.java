package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Etsy_StepDefinitions {
    EtsySearchPage etsySearchPage=new EtsySearchPage();

    @Given("user is on the etsy home page")
    public void user_is_on_the_etsy_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("etsyURL"));
    }
    @Then("user sees title as expected")
    public void user_sees_title_as_expected() {
        String expectedInTitle="Etsy Canada - Shop for handmade, vintage, custom, and unique gifts for everyone";

        BrowserUtils.verifyTitleContains( expectedInTitle);
    }

    @Then("user types Wooden Spoon in search box")
    public void user_types_wooden_spoon_in_search_box() {
        etsySearchPage.searchBox.sendKeys("Wooden Spoon");

    }
    @Then("user clicks search button")
    public void user_clicks_search_button() {
        etsySearchPage.searchButton.click();

    }
    @Then("user sees the Wooden Spoon in the title")
    public void user_sees_the_wooden_spoon_in_the_title() {
        BrowserUtils.verifyTitleContains("Wooden spoon");
    }

    @Then("user types {string} in search box")
    public void user_types_in_search_box(String searchValue) {
        etsySearchPage.searchBox.sendKeys(searchValue);

    }
    @Then("user sees the {string} in the title")
    public void user_sees_the_in_the_title(String searchValue) {
        BrowserUtils.verifyTitleContains(searchValue);

    }

}

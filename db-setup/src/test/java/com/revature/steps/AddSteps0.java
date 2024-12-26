package com.revature.steps;

import com.revature.TestRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddSteps0 {
    @When("the user provides a valid data for planet")
    public void the_user_provides_a_valid_data_for_planet() {
        TestRunner.homePage.selectPlanet();
        TestRunner.homePage.enterPlanetName("eternal atake");
    }

    @When("the user provides a valid file type {string}")
    public void the_user_provides_a_valid_file_type(String string) {
        throw new io.cucumber.java.PendingException();
    }

    @Then("the planet or moon {string} should be created successfully in the database")
    public void the_planet_should_be_created_successfully_in_the_database() {
        Assert.assertTrue(TestRunner.homePage.tableContains("eternal atake"));
    }

    @When("the user provides a valid data for moon")
    public void the_user_provides_a_valid_data_for_moon() {
        TestRunner.homePage.selectMoon();
        TestRunner.homePage.enterMoonName("majora moon");
    }

    @When("the user provides a name {string} for planet")
    public void the_user_provides_a_for_planet(String planetName) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should get a browser alert saying Invalid {string} {string}")
    public void the_user_should_get_a_browser_alert_saying_Invalid(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user provides a {string} for moon")
    public void the_user_provides_a_for_moon(String string) {

        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should get a browser alert saying Invalid file type {string}")
    public void the_user_should_get_a_browser_alert_saying_Invalid_file_type(String fileType) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

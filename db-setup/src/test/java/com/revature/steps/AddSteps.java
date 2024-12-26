package com.revature.steps;

import com.revature.TestRunner;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddSteps {
    @When("the user provides a planet with name {string}")
    public void the_user_provides_a_planet_with_name(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user provides file type {string}")
    public void the_user_provides_file_type(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the planet or moon {string} should be created successfully in the database")
    public void the_planet_or_moon_should_be_created_successfully_in_the_database(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user provides a moon with name {string}")
    public void the_user_provides_a_moon_with_name(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user provides an orbited planet id {string}")
    public void the_user_provides_an_orbited_planet_id(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the moon {string} should be created successfully in the database")
    public void the_moon_should_be_created_successfully_in_the_database(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should get a browser alert saying Invalid planet name")
    public void the_user_should_get_a_browser_alert_saying_Invalid_planet_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should get a browser alert saying \"\"Invalid moon name\"\"")
    public void the_user_should_get_a_browser_alert_saying_Invalid_moon_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should get a browser alert saying \"\"Invalid planet id\"\"")
    public void the_user_should_get_a_browser_alert_saying_Invalid_planet_id() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user provides a valid name for planet")
    public void the_user_provides_a_valid_name_for_planet() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user provides an invalid file type")
    public void the_user_provides_an_invalid_file_type() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should get a browser alert saying Invalid file type")
    public void the_user_should_get_a_browser_alert_saying_Invalid_file_type() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user provides a valid name for moon")
    public void the_user_provides_a_valid_name_for_moon() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    /**@When("the user provides a name {string} for planet")
    public void the_user_provides_a_name_for_planet(String name) {
        TestRunner.homePage.selectPlanet();
        TestRunner.homePage.enterPlanetName(name);
    }

    @When("the user provides a valid file type {string}")
    public void the_user_provides_a_valid_file_type(String fileType) {
        if (fileType != "null")
    }

    @Then("the planet or moon {string} should be created successfully in the database")
    public void the_planet_or_moon_should_be_created_successfully_in_the_database(String name) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user provides a name {string} for moon")
    public void the_user_provides_a_name_for_moon(String name) {
        TestRunner.homePage.selectMoon();
        TestRunner.homePage.enterMoonName(name);
    }

    @Then("the user should get a browser alert saying Invalid {string} name")
    public void the_user_should_get_a_browser_alert_saying_Invalid(String entityType) {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = TestRunner.driver.switchTo().alert();
        Assert.assertEquals("Invalid " + entityType + " name", alert.getText());
        alert.accept();
    }

    @When("the user provides a valid name for planet")
    public void the_user_provides_a_valid_name_for_planet() {
        TestRunner.homePage.selectPlanet();
        TestRunner.homePage.enterPlanetName("eternal atake");
    }

    @When("the user provides an invalid file type")
    public void the_user_provides_an_invalid_file_type() {

    }

    @Then("the user should get a browser alert saying Invalid file type")
    public void the_user_should_get_a_browser_alert_saying_Invalid_file_type() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = TestRunner.driver.switchTo().alert();
        Assert.assertEquals("Invalid file type", alert.getText());
        alert.accept();
    }

    @When("the user provides a valid name for moon")
    public void the_user_provides_a_valid_name_for_moon() {
        TestRunner.homePage.selectMoon();
        TestRunner.homePage.enterMoonName("majora moon");
    } **/
}

package com.revature.steps;

import com.revature.TestRunner;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginSteps {

    @Given("the user tries to login")
    public void the_user_tries_to_login() {
        TestRunner.loginPage.openLoginPage();
    }

    @When("the user provides a valid username for login")
    public void the_user_provides_a_valid_username_for_login() {
        TestRunner.loginPage.enterUsername("Super_man-2001");
    }

    @When("the user provides a valid password for login")
    public void the_user_provides_a_valid_password_for_login() {
        TestRunner.loginPage.enterPassword("Krypton-was_2000");
    }

    @Then("the user should be able to securely interact with the Planetarium")
    public void the_user_should_be_able_to_securely_interact_with_the_Planetarium() {
        try{
            TestRunner.wait.until(ExpectedConditions.titleIs("Home"));
            Assert.assertEquals(
                    String.format(
                            "Expected 'Welcome to the Home Page Batman, but got %s",
                            TestRunner.homePage.getHomePageGreeting()
                    ),
                    "Welcome to the Home Page Batman",
                    TestRunner.homePage.getHomePageGreeting());
            Assert.assertEquals(4, TestRunner.homePage.getNumberOfCelestialRows());
        } finally {
            TestRunner.homePage.logout();
        }
    }

    @When("the user provides the password {string}")
    public void the_user_provides_the_password(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should get a browser alert saying Invalid Credentials")
    public void the_user_should_get_a_browser_alert_saying_Invalid_Credentials() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

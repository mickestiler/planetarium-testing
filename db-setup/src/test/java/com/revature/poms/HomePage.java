package com.revature.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    private WebDriver driver;

    @FindBy(id = "greeting")
    private WebElement greetingHeader;

    @FindBy(id = "logoutButton")
    private WebElement logoutButton;

    @FindBy(tagName = "tr")
    private List<WebElement> tableRows;

    @FindBy(id = "locationSelect")
    private WebElement planetMoonSelect;

    @FindBy(id = "moonNameInput")
    private WebElement moonName;

    @FindBy(id = "planetNameInput")
    private WebElement planetNameInput;

    @FindBy(id = "moonNameInput")
    private WebElement moonNameInput;

    @FindBy(id = "deleteInput")
    private WebElement deleteInput;


    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getHomePageGreeting(){
        return greetingHeader.getText();
    }

    public int getNumberOfCelestialRows(){
        return tableRows.size()-1;
    }

    public void tryToAccessHomePageDirectly(){
        driver.get("http://localhost:8080/planetarium");
    }

    public void selectPlanet() {
        List<WebElement> options = planetMoonSelect.findElements(By.tagName("option"));
        options.get(1).click();
    }

    public void selectMoon() {
        List<WebElement> options = planetMoonSelect.findElements(By.tagName("option"));
        options.get(0).click();
    }

    public void enterPlanetName(String planetName) {
        planetNameInput.sendKeys(planetName);
    }

    public void enterMoonName(String moonName) {
        moonNameInput.sendKeys(moonName);
    }

    public void deleteResource(String name) {
        deleteInput.sendKeys(name);
    }

    public void logout(){
        logoutButton.click();
    }

    public boolean tableContains(String resource) {
        return tableRows.contains(resource);
    }

}

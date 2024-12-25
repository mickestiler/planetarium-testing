package org.example.steps;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewSteps {

    public static WebDriver driver = null;
    public static WebDriverWait wait;

    @BeforeClass
    public static void setup() {
        driver = new ChromeDriver();

    }
}

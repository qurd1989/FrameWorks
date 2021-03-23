package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


import java.util.concurrent.BlockingQueue;

public class OrangeHRMSteps {

    WebDriver driver;




        @Given("i launch  chrome browser")
        public void i_launch_chrome_browser() {

            WebDriverManager.chromedriver().setup();

            throw new io.cucumber.java.PendingException();
        }
        @When("i open Hrm homepage")
        public void i_open_hrm_homepage() {
            driver.get("https://opensource-demo.orangehrmlive.com/");
            throw new io.cucumber.java.PendingException();
        }
        @Then("i verify logo page")
        public void i_verify_logo_page() {

          boolean status =  driver.findElement(By.xpath("@FindBy(xpath = \"//img[@src='/webres_5fee89a90600f2.94309009/themes/default/images/login/logo.png']\")")).isDisplayed();

            Assert.assertEquals(true,status);
            throw new io.cucumber.java.PendingException();
        }
        @And("close browser")
        public void close_browser() {
            // Write code here that turns the phrase above into concrete actions
            throw new io.cucumber.java.PendingException();
        }
    }


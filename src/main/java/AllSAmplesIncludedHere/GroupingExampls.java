package AllSAmplesIncludedHere;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupingExampls {
    WebDriver driver;


    @BeforeTest
    void setup() {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://chercher.tech/java/handle-multiple-windows-tabs-selenium-webdriver");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        Alert alert = driver.switchTo().alert();

        //String alertMassage = driver.switchTo().alert().getText();

        //System.out.print(alertMassage);




    }




    @Test
    void grouping1(){

        WebElement logo = driver.findElement(By.xpath("//img[contains(@id,'logo')]"));

        Assert.assertTrue(logo.isDisplayed(), "failed");

    }
    @Test
    void grouping2(){

    }
    @Test
    void grouping3(){

    }
    @Test
    void grouping4(){

    }
    @Test
    void grouping5(){

    }
    @Test
    void grouping6(){

    }


}

package AllSAmplesIncludedHere;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Example2 {
    WebDriver driver;



    void dikdak() {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://chercher.tech/java/handle-multiple-windows-tabs-selenium-webdriver");
    }

    @Test(priority = 2)
    void customer(){
        System.out.println("me customer ");

        Assert.assertEquals(1,2);

    }
    @Test(priority = 1)
    void addcustomer(){
        System.out.println("what are you doing");
    }
    @Test(priority = 3)
    void teardown(){
        System.out.print("this test will be excuted at 1");
    }

}

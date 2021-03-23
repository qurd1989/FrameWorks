package AllSAmplesIncludedHere;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Exampl1 {
    WebDriver driver;



    void banaver() {
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://chercher.tech/java/handle-multiple-windows-tabs-selenium-webdriver");
    }

    @Test(priority = 2)
    void tests1(){
        System.out.println("this test will be excuted at 2 ");


    }
    @Test(priority = 3)
    void tests2(){
        System.out.println("this test will be excuted at 3");
    }
    @Test(priority = 1)
    void tests3(){
        System.out.print("this test will be excuted at 1");
    }

}

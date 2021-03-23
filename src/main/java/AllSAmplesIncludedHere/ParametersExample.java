package AllSAmplesIncludedHere;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {


    @BeforeClass
    @Parameters({"broswer", "url"})
    void banaver(String browser, String app) {

        if (browser.equalsIgnoreCase("crhome")) {

            System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();

        }
    }
        @Test(priority = 0)
    void afterMethod(){
        System.out.println("this is after methods 1");
    }

    @Test(priority = 4)
    void case1(){
        System.out.println("this is case 2 ");


    }
    @Test(dependsOnMethods = {"case3"})
    void case2(){
        System.out.println("this is case 4");
    }
    @Test(priority = 1)
    void case3() {
        System.out.print("this is case 5");
    }

    @Test(priority = 12,enabled = false)
    void beforeTest() {
        System.out.println("This is before test 6");
    }
    @Test(priority = 14)
    void afterTest(){
        System.out.println("this is after test 7");
    }
}


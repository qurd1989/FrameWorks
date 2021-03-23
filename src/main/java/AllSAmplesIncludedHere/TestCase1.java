package AllSAmplesIncludedHere;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestCase1 {
  //static WebDriver driver;


    @BeforeClass
            void beforeclass() {
        System.out.print("before class tests");
    }
    @BeforeMethod
    void beforeMethod() {

        System.out.println("this is before methods");


    }
    @AfterMethod
    void afterMethod(){
        System.out.println("this is after methods");
    }

    @Test(priority = 2)
    void case1(){
        System.out.println("this is case 1 ");


    }
    @Test(priority = 3)
    void case2(){
        System.out.println("this is case 2");
    }
    @Test(priority = 1)
    void case3() {
        System.out.print("this is case 3");
    }

        @BeforeTest
                void beforeTest() {
            System.out.println("This is before test");
        }
        @AfterTest
    void afterTest(){
        System.out.println("this is after test");
        }


}

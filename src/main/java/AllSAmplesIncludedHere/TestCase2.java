package AllSAmplesIncludedHere;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2 {

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
    void case4(){
        System.out.println("this is case 4 ");


    }
    @Test(priority = 3)
    void case5(){
        System.out.println("this is case 5");
    }
    @Test(priority = 1)
    void case6(){
        System.out.print("this is case 6");
    }

}

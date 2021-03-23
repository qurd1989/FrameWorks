package AllSAmplesIncludedHere;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityExampls {

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

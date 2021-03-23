package JavaSampleCodes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class thisAndthisMethod {
    int num;

    public static void main(String[] args) {


        thisAndthisMethod n1 = new thisAndthisMethod();
        n1.favorite(8);
        System.out.println("your favorite number is " + n1.num);


       WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();


                driver.get("https://www.jetbrains.com/help/idea/selenium.html");

    }

     public  void favorite(int num) {
        // this.num = num;

     }

}

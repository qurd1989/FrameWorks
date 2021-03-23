package AllSAmplesIncludedHere;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExampls {

    @Test(dataProvider = "loginDataProvider")
    public void loginTest(String email, String psw){
        System.out.print(email+ "    "  + psw);


    }

    @DataProvider(name = "loginDataProvider")
    public Object[][] getData(){


        Object[][] data = {{"abc@gmail","abcpsw"},{"elqu/@gmail","dwqpsw"},{"adwjref@gmail","kgjdfjdpws"}};

        return data;
    }




}

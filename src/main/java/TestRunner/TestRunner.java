package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//abdiy//Desktop//FrameWorks//src//main//java//featureFiles//FirstFeature.feature",
        glue = "StepDefinitions"

)
public class TestRunner {

}

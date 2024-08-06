package TestsRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features= {"src/test/resources/Featuress"},
glue= {"StepDefinitiions"},
plugin= {"pretty","html:target/htmlreport.html"})

public class CucumberTestsRunner extends AbstractTestNGCucumberTests {

}

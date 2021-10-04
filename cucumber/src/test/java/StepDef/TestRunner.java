package StepDef;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDef"}, monochrome =true,
plugin = {"pretty","json:target/JSONReports/Report.json",
		"junit:target/JunitReports/Report.xml"}

		)

public class TestRunner {

}

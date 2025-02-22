package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/main/resources/FaceBookLogin.feature", glue={"stepDefinitions","Hooks"},
plugin={"pretty",
		"html:target/testoutput/fbreport.html",
		"json:target/testoutput/fbjsonreport.json",
		"junit:target/testoutput/fbxmlreport.xml"
		}, dryRun=false	)

public class RunnerClass {

	
	

}

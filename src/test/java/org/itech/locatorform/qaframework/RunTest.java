package org.itech.locatorform.qaframework;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // defining ordered by name features folder
        features = { "src/features" },
        // defining the definition steps package
        glue = "org.itech.locatorform.qaframework.automation", plugin = { "html:target/index.html",
                "message:target/cucumber.ndjson" }, monochrome = true)
public class RunTest {
	
	public class HOOK {
		public static final String LOCATOR_FORM = "@locator";		
	}
}

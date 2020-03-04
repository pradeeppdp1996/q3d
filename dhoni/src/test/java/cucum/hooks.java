package cucum;

import java.io.File;

import com.aventstack.extentreports.gherkin.model.Scenario;
import com.cucumber.listener.Reporter;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks extends FunctionalLibrary{
@Before
public static void driver(cucumber.api.Scenario scenario) {
	System.out.println(scenario.getName());
	}
@After
public static void screenshot(cucumber.api.Scenario scenario) throws Throwable  {
	takeScreenShot("adactin");
	if (scenario.isFailed()) {
		File filePath = takeScreenShot(scenario.getName());
		Reporter.addScreenCaptureFromPath(filePath.getAbsolutePath());
	}
}

}


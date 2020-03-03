package cucum;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty", "json:D:\\eclipse dir\\dhoni\\json report\\reppor.json",
		"junit:D:\\eclipse dir\\dhoni\\junit report\\jnuit.xml",
		"html:D:\\eclipse dir\\dhoni\\html report","com.cucumber.listener.ExtentCucumberFormatter:extentreport\\pdp.html"},
		features="D:\\eclipse dir\\dhoni\\feature file\\Adactin.feature",glue="cucum",monochrome=true)
public class testrunner {
	public static WebDriver driver;
	@BeforeClass
	public static void launch() throws Exception {
		FunctionalLibrary.browserlaunch("chrome");
	}
	@AfterClass
	public static void report() {
		Reporter.loadXMLConfig("D:\\eclipse dir\\dhoni\\src\\test\\java\\extent-config.xml");
		String string = System.getProperty("os.name").toString();
		System.out.println(string);
		
//		driver.quit();

	}
	
}
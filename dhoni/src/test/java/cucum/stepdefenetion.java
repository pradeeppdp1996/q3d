package cucum;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class stepdefenetion extends FunctionalLibrary {
	loginpage lp=new loginpage();
	checkoutdate cp=new checkoutdate();
	validationpage vp=new validationpage();
	book_a_hotel_page bp=new book_a_hotel_page();
	datadriven dp=new datadriven();
	@Given("^User launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
	    
	    website("https://adactin.com/HotelApp/");
	}

	@Then("^User enter the username in the login module$")
	public void user_enter_the_username_in_the_login_module() throws Throwable {
	    text(lp.getEmailIdFeild(), dp.retr(0, 0));
	    
	}

	@Then("^User enter the password in the login module$")
	public void user_enter_the_password_in_the_login_module() throws Throwable {
	    text(lp.getPassWordFeild(), dp.retr(1, 0));
	    
	}

	@Then("^User click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
	    
	    clickOntheElement(lp.getLoginbutton());
	    Thread.sleep(2000);
	}

	@Then("^User selects the hotel location$")
	public void user_selects_the_hotel_location() throws Throwable {
	    selectoptioninDropDown(cp.getLocation(), "Brisbane", "visibletext");
	    
	}

	@Then("^User selects the hotel$")
	public void user_selects_the_hotel() throws Throwable {
	 selectoptioninDropDown(cp.getHotel(), "Hotel Creek", "values");   
	    
	}

	@Then("^User selects the roomtype$")
	public void user_selects_the_roomtype() throws Throwable {
	    selectoptioninDropDown(cp.getRoomtype(), "Standard","visibletext");
	    
	}

	@Then("^User selects the no of room$")
	public void user_selects_the_no_of_room() throws Throwable {
		selectoptioninDropDown(cp.getNoofrooms(), "2", "index");
	    
	}

	@Then("^User enters the in date$")
	public void user_enters_the_in_date() throws Throwable {
	    text(cp.getIndate(), "04/02/2020");
	    
	}

	@Then("^User enters the out date$")
	public void user_enters_the_out_date() throws Throwable {
	    text(cp.getOutdate(), "05/02/2020");
	    
	}

	@Then("^user enters number of adults$")
	public void user_enters_number_of_adults() throws Throwable {
	    selectoptioninDropDown(cp.getAdultcount(), "2", "index");
	    
	}

	@Then("^user enters the children per room$")
	public void user_enters_the_children_per_room() throws Throwable {
	    
	    selectoptioninDropDown(cp.getChildcout(), "2", "index");
	}

	@Then("^User click on search button$")
	public void user_click_on_search_button() throws Throwable {

	    clickOntheElement(cp.getSearchbutton());
	    Thread.sleep(2000);
	}
//	@Then("^user validate the search$")
//	public void user_validate_the_search() throws Throwable {
//String text = lp.getAlertmessage().getAttribute("text");
//Assert.assertEquals("Check-In Date shall be before than Check-Out Date" 
//		,text );
//}
	@Then("^user validate the location of hotel$")
	public void user_validate_the_location_of_hotel() throws Throwable {
		String mes="Brisbane";
		Thread.sleep(2000);
String attribute = vp.getConfirmation().getAttribute("value");
//System.out.println(attribute);
Assert.assertTrue(attribute.contains(mes));
//TakesScreenshot ts= (TakesScreenshot)driver;
//File source=ts.getScreenshotAs(OutputType.FILE);
//File des=new File("D:\\eclipse dir\\dhoni\\screenshot\\pdp.png");
//FileUtils.copyFile(source, des);
	}
	@Then("^user validate the dates of booking$")
	public void user_validate_the_dates_of_booking() throws Throwable {
		String date1=vp.getArrivaldate().getAttribute("value");
		String date2=vp.getDeparturedate().getAttribute("value");
		Assert.assertEquals("04/02/2020", date1);
		Assert.assertEquals("05/02/2020", date2);
		Thread.sleep(2000);
	}
	@Then("^user validate the no of room and room type$")
	public void user_validate_the_no_of_room_and_room_type() throws Throwable {
String roomcount = vp.getRoomcount().getAttribute("value");
	String roomtype = vp.getRoomtype().getAttribute("value");
	Assert.assertTrue(roomcount.contains("2"));
	Assert.assertTrue(roomtype.contains("Standard"));
	}
	@Then("^user go to booking final page$")
	public void user_go_to_booking_final_page() throws Throwable {
clickOntheElement(vp.getSelect());
clickOntheElement(vp.getContinueWebElement());
	}

	@Then("^user validate the cost including gst$")
	public void user_validate_the_cost_including_gst() throws Throwable {
	String gst = bp.getFinalcost().getAttribute("value");
	Assert.assertEquals("AUD $ 148.5", gst);
	bp.getFinalcost().isEnabled();
	Capabilities cp=((RemoteWebDriver)driver).getCapabilities();
	String browserName = cp.getBrowserName();
	System.out.println(browserName);
	String version = cp.getVersion();
	System.out.println(version);

	}

}

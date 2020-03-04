package cucum;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutdate extends FunctionalLibrary {
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_nos")
	private WebElement noofrooms;
	@FindBy(id="datepick_in")
	private WebElement indate;
	@FindBy(id="datepick_out")
	private WebElement outdate;
	@FindBy(id="adult_room")
	private WebElement adultcount;
	@FindBy(id="child_room")
	private WebElement childcout;
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(id="Submit")
	private WebElement searchbutton;
	@FindBy(id="checkin_span")
	private WebElement alert;
	
	public WebElement getAlert() {
		return alert;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getNoofrooms() {
		return noofrooms;
	}
	public WebElement getIndate() {
		return indate;
	}
	public WebElement getOutdate() {
		return outdate;
	}
	public WebElement getAdultcount() {
		return adultcount;
	}
	
	public WebElement getChildcout() {
		return childcout;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
public checkoutdate() {
	PageFactory.initElements(driver, this);
}
}

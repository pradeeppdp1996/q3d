package cucum;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class validationpage extends FunctionalLibrary {
	@FindBy(id="hotel_name_0")
	private WebElement hotelname;
	@FindBy(xpath="//input[@id='location_0']")
	private WebElement locationname;
	@FindBy(id="rooms_0")
	private WebElement roomcount;
	@FindBy(id="arr_date_0")
	private WebElement arrivaldate;
	@FindBy(id="dep_date_0")
	private WebElement departuredate;
	@FindBy(id="no_days_0")
	private WebElement noofdays;
	@FindBy(id="room_type_0")
	private WebElement roomtype;
	@FindBy(id="price_night_0")
	private WebElement price;
	public WebElement getContinueWebElement() {
		return continueWebElement;
	}
	public WebElement getConfirmation() {
		return confirmation;
	}
	@FindBy(id="radiobutton_0")
	private WebElement select;
	@FindBy(id="continue")
	private WebElement continueWebElement;
	@FindBy(xpath="//input[@id='location_0']")
	private WebElement confirmation;
	public WebElement getSelect() {
		return select;
	}
	public WebElement getHotelname() {
		return hotelname;
	}
	public WebElement getLocationname() {
		return locationname;
	}
	public WebElement getRoomcount() {
		return roomcount;
	}
	public WebElement getArrivaldate() {
		return arrivaldate;
	}
	public WebElement getDeparturedate() {
		return departuredate;
	}
	public WebElement getNoofdays() {
		return noofdays;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getPrice() {
		return price;
	}
	public WebElement getTotalprice() {
		return totalprice;
	}
	@FindBy(id="total_price_0")
	private WebElement totalprice;
	
public validationpage() {
	PageFactory.initElements(driver, this);
}
}

package cucum;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class book_a_hotel_page extends FunctionalLibrary{
@FindBy(id="final_price_dis")
private WebElement finalcost;
@FindBy(id="total_price_dis")
private WebElement priceforroom;
@FindBy(id="total_days_dis")
private WebElement finalnoofrooms;
@FindBy(id="total_days_dis")
private WebElement finalnoofdays;
@FindBy(id="room_type_dis")
private WebElement finalroomtype;
@FindBy(id="location_dis")
private WebElement finallocation;
@FindBy(id="hotel_name_dis")
private WebElement finalhotelname;
public WebElement getFinalcost() {
	return finalcost;
}
public WebElement getPriceforroom() {
	return priceforroom;
}
public WebElement getFinalnoofrooms() {
	return finalnoofrooms;
}
public WebElement getFinalnoofdays() {
	return finalnoofdays;
}
public WebElement getFinalroomtype() {
	return finalroomtype;
}
public WebElement getFinallocation() {
	return finallocation;
}
public WebElement getFinalhotelname() {
	return finalhotelname;
}
public book_a_hotel_page() {
	PageFactory.initElements(driver, this);
}

}

package cucum;

import org.openqa.selenium.By;

public class chumma extends FunctionalLibrary{

public static void main(String[] args) throws Exception {
	browserlaunch("chrome");
	website("https://adactin.com/HotelApp/SelectHotel.php");
	System.out.println(driver.findElement(By.xpath("//input[@id='hotel_name_0']")).getText());	}

}


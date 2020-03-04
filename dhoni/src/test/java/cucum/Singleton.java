package cucum;

public class Singleton {
	private datadriven dp;
private loginpage lp;
private forgotpassword fp;
private checkoutdate cp;
private validationpage vp;
private book_a_hotel_page bp;
public datadriven getdp() {
	if (dp==null) {
		System.out.println("object created");
	dp=new datadriven();
	}
	return dp;
}
public book_a_hotel_page getbp() {
	if (bp==null) {
		System.out.println("object created");
	bp=new book_a_hotel_page();
	}
	return bp;
}
public validationpage getvp() {
	if (vp==null) {
		System.out.println("object created");
	vp=new validationpage();
	}
	return vp;
	
}
public loginpage getLp() {
	if (lp==null) {
		System.out.println("object created");
		lp=new loginpage();
	}
	return lp;
}
public forgotpassword getFp() {
if (fp==null) {
			fp= new forgotpassword();	
		}
return fp;}
public checkoutdate getcp() {
	if (cp==null) {
		System.out.println("object created");
		cp=new checkoutdate();
	}
	return cp;
}
}

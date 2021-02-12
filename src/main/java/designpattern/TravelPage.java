package designpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelPage {
	By tooperpage=By.id("buttons");
	By footerpage=By.id("traveller-home");
	WebDriver driver;
	checkavail ca;
	public TravelPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public Tooperpage gettooperpage() {
		return new Tooperpage(driver,tooperpage);
	
	}
	
	public Footerpage getfooterpage() {
		return new Footerpage(driver,footerpage);
	}
	
	public void setbookingstrategy(String name) {
		Strategyfactor sf=new Strategyfactor();
		ca=sf.strategy(name);
	}
	
	public void availablity(String orgin,String dest) {
		ca.avail(orgin, dest);
	}

	public void demo() {
		System.out.println("demo");
	}
}

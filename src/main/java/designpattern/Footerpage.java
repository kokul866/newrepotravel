package designpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Footerpage extends Abstractclass {
	
	
	public Footerpage(WebDriver driver, By sectionelement) {
		super(driver, sectionelement);
		// TODO Auto-generated constructor stub
	}

	By title=By.cssSelector("[title='Flights']");
	
	public String getattribute() {
		String value= findelement(title).getAttribute("class");
		return value;
	}
}

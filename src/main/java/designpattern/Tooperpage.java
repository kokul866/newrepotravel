package designpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tooperpage extends Abstractclass {

	
	public Tooperpage(WebDriver driver, By tooperpage) {
		// TODO Auto-generated constructor stub
		super(driver,tooperpage);
	}

	By title=By.cssSelector("[title='Flights']");
	
	public String getattribute() {
		String value= findelement(title).getAttribute("class");
		return value;
	}
}

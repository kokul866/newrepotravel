package designpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class Abstractclass {
       WebElement sectionelement;
	public Abstractclass(WebDriver driver, By sectionelement) {
		// TODO Auto-generated constructor stub
		this.sectionelement=driver.findElement(sectionelement);
	}
	
	public WebElement findelement(By findelementby)
	{
		return sectionelement.findElement(findelementby);
	}

}

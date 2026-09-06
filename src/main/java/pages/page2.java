package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page2 {
	WebDriver driver;
	String date="01-08-2026";
	@FindBy(id="input_text")
	WebElement inputBox;
	
	public page2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getInputBox() {
		return(inputBox);
	}
}

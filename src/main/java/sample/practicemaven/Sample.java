package sample.practicemaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.ElementPage;
import pages.page2;

public class Sample {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
driver.get("https://www.engineerdiaries.com/selenium");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
page2 page=new page2(driver);
page.getInputBox().clear();
page.getInputBox().sendKeys("hell90123");

}}

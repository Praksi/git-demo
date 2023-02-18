package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.elementutils;
public class HomePage {

	WebDriver driver;
	elementutils elementutils;
	//Page Elements
	By userName = By.className("oxd-userdropdown-name");
	
	By allLinks = By.className("oxd-main-menu-item--name");
	
	By timeLink = By.xpath("//span[text()='Time']");
	
	By PIMButton = By.xpath("//span[text()='PIM']");
	
	
	
	//Constructor
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		elementutils = new elementutils(driver);
	}
	
	
	//Page Actions
	public boolean isUserNamePresent() {
	
	 return elementutils.isElementPresent(userName, 10);
//	{
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		try {
//		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(userName));
//			return true;
//		}
//		catch(NoSuchElementException e)
//		{
//			return false;
//		}
	}
	
	public String getUserName()
	{
		return driver.findElement(userName).getText();
	}
	
	
	
	public ArrayList<String> getLinks()
	{
		ArrayList<String> texts = new ArrayList<String>();
		List<WebElement> list = driver.findElements(allLinks);
		
		for(WebElement e : list)
		{
			texts.add(e.getText());
		}
		
		return texts;
	}
	
	
	public TimeTimeSheetsPage clickTimeLink()
	{
		
		elementutils.doclick(timeLink);		
		return new TimeTimeSheetsPage(driver);
	}
	
	
	public PimPage pimbutton() {
	
		elementutils.doclick(PIMButton);
		return new PimPage(driver);
	}
	
	
	
	
	
	
	
	
	
}

package util;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class elementutils {
	  WebDriver driver;
	  
	static Logger log=Logger.getLogger(elementutils.class.getName());
public elementutils(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public  void enterText(By locator,String Text) {
             log.info("inside enterusername method");
	        log.info("Locator :"+ locator);
		try {
		driver.findElement(locator).sendKeys(Text);
		log.info("username successfully entered");
	}
	catch(Exception e) {
		log.info("username not entered successfully");
		log.error(e.toString());
	}
	}
	
	public void doclick( By locator) {
		
		log.info("inside doclick method");
		log.info("Locator:"+locator);
		try {
			driver.findElement(locator).click();
			log.info("successful click on button");
		}
		catch(Exception e){
			log.info("unscessful click on button");
			log.error(e.toString());
		}	
	}
	
	public boolean isElementPresent(By locator, int time) {
		log.info("inside isElementPresent method");
		log.info("locator:"+locator);
		try {
			WebDriverWait wait = new WebDriverWait(driver, time);
			WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			log.info("Element is present");
			return true;
		}
		catch(Exception e) {
			log.info("Element is not present");
			log.error(e.toString());
			return false;
		}
	}	
	
	public String gettextinvalCred(By locator) {
		log.info("inside gettext method");
		log.info("locator:"+ locator);
	
		WebElement element = driver.findElement(locator);
	    log.info("text found");
		return element.getText();
	}
	
	public String getTitle(By locator, By locator1,int time) {
		log.info("inside get title");
		log.info("locator:"+ locator);
		
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		String str1 = driver.findElement(locator).getText();
		String str2 = driver.findElement(locator1).getText();
		return str1+" / "+ str2;
	}
	
	

}

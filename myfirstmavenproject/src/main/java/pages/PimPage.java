package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.elementutils;
public class PimPage {
	
	WebDriver driver;
    elementutils elementutils;
	
	
	By EmployeeName=By.xpath("//label[text()='Employee Name']/parent::div/following-sibling::div//input");
	By EmployeeId=By.xpath("//label[text()='Employee Id']/parent::div/following-sibling::div//input");
	By SupervisorName=By.xpath("//label[text()='Supervisor Name']/parent::div/following-sibling::div//input");
    By EmploymentStatus =By.xpath("//label[text()='Employment Status']/parent::div/following-sibling::div//div[text()='-- Select --']");
    By CurrentEmployeesOnly =By.xpath("//label[text()='Include']/parent::div/following-sibling::div//div[text()='Current Employees Only']");
    By JobTitle =By.xpath("//label[text()='Job Title']/parent::div/following-sibling::div//div[text()='-- Select --']");
    By SubUnit =By.xpath("//label[text()='Sub Unit']/parent::div/following-sibling::div//div[text()='-- Select --']");
    
   By PartTimeInternship =   By.xpath("//div[@role='listbox']//div/span[text()='Part-Time Internship']");
   By CurrentandPastEmployees =By.xpath("//div[@role='listbox']//div/span[text()='Current and Past Employees']");
   By ITManager=By.xpath("//div[@role='listbox']//div/span[text()='IT Manager']");
   By Engineering=By.xpath("//div[@role='listbox']//div/span[text()='Engineering']");
    
	By searchButton=By.xpath("//button[text()=' Search ']");
	By pimpresent=By.xpath("//h6[text()='PIM']");
	
	
	public PimPage(WebDriver driver) {
		this.driver=driver;
		elementutils = new elementutils(driver);
	}
	
	public boolean PIMpresent() {
		
	return	elementutils.isElementPresent(pimpresent, 10);
		
//		WebDriverWait wait = new WebDriverWait( driver,5);
//		try {
//	WebElement ele=	wait.until(ExpectedConditions.presenceOfElementLocated(pimpresent));
//		return true;
//	}
//	 catch(TimeoutException e) {
//		 return false;
//	 }
	}
	
	public void EmployeeName( String empname) {
		elementutils.enterText(EmployeeName, empname);
	//	driver.findElement(EmployeeName).sendKeys("empname");
		
	}
	
	public void EmployeeId( String id) {
		elementutils.enterText(EmployeeId, id);
		//driver.findElement(EmployeeId).sendKeys(id);
	}
	
	public void SupervisorName( String supName) {
		elementutils.enterText(SupervisorName, supName);
	//	driver.findElement(SupervisorName).sendKeys(supName);
			
	}
	
	public boolean EmploymentStatus() {
		elementutils.doclick(EmploymentStatus);
	//	driver.findElement(EmploymentStatus).click();
	 return  elementutils.isElementPresent(PartTimeInternship, 10);
		
//		WebDriverWait wait =new WebDriverWait(driver,20);
//		try {
//			
//	  WebElement webele=wait.until(ExpectedConditions.presenceOfElementLocated(PartTimeInternship));
//	       webele.click();
//	          return true;
//	  
//		}
//		catch (TimeoutException e) {
//			return false;
//		}
//			
	}
	
	
	public boolean CurrentEmployeesOnly() {
		elementutils.doclick(CurrentEmployeesOnly);
		//driver.findElement(CurrentEmployeesOnly).click();
		
	return	elementutils.isElementPresent(CurrentandPastEmployees, 10);
		
//		WebDriverWait wait =new WebDriverWait(driver,10);
//		try {
//			
//	  WebElement currentemployee=wait.until(ExpectedConditions.presenceOfElementLocated(CurrentandPastEmployees));
//	  currentemployee.click();
//	  return true;
//	  }
//		catch(TimeoutException e) {
//			return false;
//		}
	}
	
	
	
	public boolean JobTitle() {
		elementutils.doclick(JobTitle);
	//	driver.findElement(JobTitle).click();
		
	 return	elementutils.isElementPresent(ITManager, 10);
//		WebDriverWait wait =new WebDriverWait(driver,10);
//		try {
//			
//	  WebElement ITmanager=wait.until(ExpectedConditions.presenceOfElementLocated(ITManager));
//	  ITmanager.click();
//	  return true;
//	  }
//		catch(TimeoutException e) {
//			return false;
//		}
		
		
	}
	
	
   public boolean SubUnit() {
	   elementutils.doclick(SubUnit);
	  // driver.findElement(SubUnit).click();
	  return  elementutils.isElementPresent(Engineering, 10);
//	   WebDriverWait wait =new WebDriverWait(driver,10);
//		try {
//			
//	  WebElement Engineer=wait.until(ExpectedConditions.presenceOfElementLocated(Engineering));
//	  Engineer.click();
//	  return true;
//	  }
//		catch(TimeoutException e) {
//			return false;
//		}
	 
   }
	public void clickonsearchButton(){
		
		elementutils.doclick(searchButton);
			  //driver.findElement(searchButton).click();
			  
			 
	} 
	
	
	
}

package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.PimPage;
import testbase.TestBase;

public class PimTest extends TestBase {
	
	@Test
	public void Pimtest()  {
		
		LoginPage login = new LoginPage(driver);
		HomePage homePage = login.doLogin("Admin", "admin123");
		Assert.assertEquals(homePage.isUserNamePresent(), true);
		PimPage pimpage= homePage.pimbutton();
		Assert.assertEquals(pimpage.PIMpresent(), true);
		pimpage.EmployeeName("jack");
		pimpage.EmployeeId("234");
		pimpage.SupervisorName("Lisa haiden");
		boolean flag=pimpage.EmploymentStatus();
	Assert.assertEquals(flag, true);
	boolean fg=	pimpage.CurrentEmployeesOnly();
	 Assert.assertEquals(fg, true);
		boolean fl=	pimpage.JobTitle();
		 Assert.assertEquals(fl, true);
			boolean flg=pimpage.SubUnit();
			 Assert.assertEquals(flg, true);
	  pimpage.clickonsearchButton(); 
	
	}
	
	
	
	

}

package driverFactory;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Listener.webdriverListener;
import io.github.bonigarcia.wdm.WebDriverManager;

public class driverfactory {
static WebDriver driver;
static Logger log =Logger.getLogger(driverfactory.class.getName());	

	public static WebDriver init_driver(String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
//			WebDriverManager.edgedriver().setup();
//			WebDriverManager.firefoxdriver().setup();
			log.info("chorme initilaized");
			 driver = new ChromeDriver();
			}
			else if(browser.equals("Edge")) {
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				log.info("edge initialized");
			}
			else {
				System.out.println("Enter correct browser");
				System.exit(0);
			}
			driver.manage().window().maximize();
			EventFiringWebDriver edriver = new EventFiringWebDriver( driver);
			webdriverListener weblistener = new webdriverListener();
			edriver.register(weblistener);
			driver=(WebDriver)edriver;
			
			return driver;
	}
	
	public static WebDriver getdriver() //can use to initilaze multipule time
	{
	return driver;
	}
	
	
}

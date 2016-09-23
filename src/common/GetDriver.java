package common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import common.SpringerDataProperties;

public class GetDriver {
	
	
	public WebDriver driver =null;
	
	public WebDriver getDriver(){
		return driver;
	}
	
	public WebDriver getDriver(SpringerDataProperties springerDataProperties) {
		
		String browser = springerDataProperties.getBrowser();
		
		try {
			if(browser.contains("Chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\src\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else {  driver = new FirefoxDriver();
		}

			
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return driver;
	}
}
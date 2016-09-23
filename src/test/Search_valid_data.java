package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageFactory.Search_link_page;

import common.GetDriver;
import common.SpringerDataProperties;

public class Search_valid_data {

	
	public static WebDriver driver = null;
	public static GetDriver getDriver =null;
	public String output="";
	public String expected="";
	public static SpringerDataProperties springerDataProperties =null;
	

	@Test
	public void Search_valid_data() {
		
			System.out.println("***Initializing the properties*****");
			springerDataProperties = new SpringerDataProperties();
			getDriver =new GetDriver();
			driver = getDriver.getDriver(springerDataProperties);
			driver.get(springerDataProperties.getLink());
		
		
		try {
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
			
			Search_link_page Search_valid_data = PageFactory.initElements(driver, Search_link_page.class);
			/* Included sleep to analyse the page displayed*/
			Thread.sleep(1000);
			
			Search_valid_data.getsearch().sendKeys("Chemistry art");
			Search_valid_data.getSearch_enter().click();
			
			Thread.sleep(1000);			
			output = Search_valid_data.getresult_message().getText();
			
			System.out.println("The results page dislays: " + output);
			expected = "Chemistry";
			
			assert output.contains(expected);
			/* Closing the web page window */
			driver.quit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

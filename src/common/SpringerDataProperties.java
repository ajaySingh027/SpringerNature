package common;

import java.io.FileInputStream;
import java.util.Properties;

public class SpringerDataProperties {
	
	private String browser;
	private String link;
	
	
	public SpringerDataProperties() {
		getPropertyData();
	}
	
	
	public void getPropertyData() {
		Properties properties = new Properties();
		
		
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/springerInformation.properties");
			properties.load(fis);
			
			browser = properties.getProperty("browser");
			link = properties.getProperty("link");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public String getBrowser() {
		return browser ;
	}
	
	
	public String getLink() {
		return link ;
	}
}

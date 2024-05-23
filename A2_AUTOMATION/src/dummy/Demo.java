 package dummy;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo {
	
	public static void main(String[] args) throws IOException  {
		
		//step 1-->get the object of properties file
		FileInputStream fis=new 
		FileInputStream("./commondata/A2Commondata.properties");
		//step 2-->load the properties file
		Properties prop=new Properties();
		prop.load(fis);
		//step 3-->read the data
		String url = prop.getProperty("URL");
		System.out.println(url);
	}

}

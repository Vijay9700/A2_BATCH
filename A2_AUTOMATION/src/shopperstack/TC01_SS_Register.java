package shopperstack;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC01_SS_Register {
	// WebDriver driver;
	@Test(groups = "smoke")
	// @Parameters("browser")
	public void register() throws IOException {
		WebDriver driver = new ChromeDriver();
		// browser config
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//			driver=new ChromeDriver();
//		}
//		else if(browser.equalsIgnoreCase("edge"))
//		{
//			driver=new EdgeDriver();
//		}
//		else if(browser.equalsIgnoreCase("internetexplorer"))
//		{
//			driver=new InternetExplorerDriver();
//		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		// driver.get("https://shoppersstack.com/");

		// read data from properties and access SS
		// step 1-->get the object of properties file
		FileInputStream fis = new FileInputStream("./commondata/A2Commondata.properties");
		// step 2-->load the properties file
		Properties prop = new Properties();
		prop.load(fis);
		// step 3-->read the data
		String url = prop.getProperty("URL");
		driver.get(url);
		
		// click on login in welcome page
		driver.findElement(By.id("loginBtn")).click();
		// clik on create account button
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		// enter fn
		driver.findElement(By.id("First Name")).sendKeys("LEO");
		// enter ln
		driver.findElement(By.id("Last Name")).sendKeys("DAS");
		// choose male
		driver.findElement(By.id("Male")).click();
		// enter phno
		driver.findElement(By.id("Phone Number")).sendKeys("9787071322");
		// enter email
		driver.findElement(By.id("Email Address")).sendKeys("leodas@gmail.com");
		// enter password
		driver.findElement(By.id("Password")).sendKeys("Leodas@123");
		// enter confirm password
		driver.findElement(By.id("Confirm Password")).sendKeys("Leodas@123");
		// click on terms
		driver.findElement(By.id("Terms and Conditions")).click();
		// click on reg button
		driver.findElement(By.id("btnDisabled")).click();
		driver.quit();
	}

}

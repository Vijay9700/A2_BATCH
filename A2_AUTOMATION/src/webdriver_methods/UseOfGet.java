package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGet {
	
	public static void main(String[] args) throws InterruptedException  {
		//launch browser
		WebDriver driver=new ChromeDriver();
		//access amazon
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		//access flipkart
		driver.get("https://www.flipkart.com/");
		
		
	}

}

package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_ChromeOptions {
	
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("headless");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize(); 
		driver.get("https://www.redbus.in/");
	}

}

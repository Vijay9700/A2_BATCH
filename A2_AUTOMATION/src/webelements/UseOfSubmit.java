package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfSubmit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//submit()-->will work
		
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.name("login")).submit();
		
		//submit()-->wont work
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).submit();//USOE
	}

}

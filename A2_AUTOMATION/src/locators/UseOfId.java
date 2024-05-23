package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfId {
	public static void main(String[] args) throws InterruptedException {
		//launch  browser
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//access the DWS
		driver.get("https://demowebshop.tricentis.com/register");
		//identify male radio button and click
		WebElement maleRadioButton = driver.findElement(By.id("gender-male"));
		Thread.sleep(2000);
		maleRadioButton.click();
		//identify fn and pass data
		WebElement firstname = driver.findElement(By.id("FirstName"));
		firstname.sendKeys("vijay");
		
	}

}

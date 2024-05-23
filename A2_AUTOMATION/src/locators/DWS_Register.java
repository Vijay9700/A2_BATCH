package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_Register {
	public static void main(String[] args) {
		//launch browser
		WebDriver driver=new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		//navigate to DWS
		driver.get("https://demowebshop.tricentis.com/register");
		//identify male/female and click
		driver.findElement(By.id("gender-male")).click();
		//identify firstname and pass data
		driver.findElement(By.id("FirstName")).sendKeys("Vijay");
		//identify lastname and pass data
		driver.findElement(By.id("LastName")).sendKeys("Ganesan");
		//identify email and pass data
		driver.findElement(By.id("Email")).sendKeys("vjy@gmail.com");
		//identify pwd and pass data
		driver.findElement(By.id("Password")).sendKeys("vj@123");
		//identify cpwd and pass data
		driver.findElement(By.id("ConfirmPassword")).sendKeys("vj@123");
		//identify register and click
		driver.findElement(By.id("register-button")).click();
	}

}

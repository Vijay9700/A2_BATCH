package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByCompleteAttribute {
	public static void main(String[] args) {
		WebDriver driver=new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//identify email and pass data
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("msd@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("msd@123");
		//driver.findElement(By.xpath("//button[@id='u_0_5_sZ']")).click();
		driver.findElement(By.xpath("//button[contains(@id,'u_0_5_')]")).click();
	}

}

package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfClear {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("vijay@gmail.com");
		email.clear();
		Thread.sleep(1000);
		email.sendKeys("msd@gmail.com");
		email.clear();
		Thread.sleep(1000);
		email.sendKeys("rohit@gmail.com"); 
	}

}

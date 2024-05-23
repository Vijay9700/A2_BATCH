package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfName {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//identify email and pass data
		driver.findElement(By.name("email")).sendKeys("vj@gmail.com");
		//identify pwd and pass data
		driver.findElement(By.name("pass")).sendKeys("msd@123");
		//identify login and click
		driver.findElement(By.name("login")).click();
	}

}

package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecialOperations {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//identify email
		WebElement email = driver.findElement(By.id("email"));
	  	email.sendKeys("vj@gmail.com");
		Thread.sleep(1000);
		//email.clear();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].value=''",email);
		js.executeScript("history.go()");
	} 

}

package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		//identify the disable element
		WebElement disable = driver.findElement(By.xpath("//input[@class='form-control']"));
		//disable.sendKeys("mobile");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='mobile'", disable);
	}
   
}

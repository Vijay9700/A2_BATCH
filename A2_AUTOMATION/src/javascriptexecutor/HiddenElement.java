package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		//identify the hidden element
		WebElement custom = 
				driver.findElement(By.name("custom_gender"));
		//JSE
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='others'", custom);
		
	}

}

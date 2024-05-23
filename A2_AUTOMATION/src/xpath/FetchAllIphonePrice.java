package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAllIphonePrice {

	public static void main(String[] args) throws InterruptedException {
		// launch browser
		WebDriver driver = new ChromeDriver();
		// maximize
		driver.manage().window().maximize();
		// navigate to flipkart
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		// click on X-mark
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(2000);
		// identify the searchbox and pass iphone
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		Thread.sleep(2000);
		// identify search symbol and click
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		//fetch all price
		List<WebElement> allPrice = 
		driver.findElements(By.xpath("//div[contains(text(),'iPhone')]/../../div[2]/div[1]/div/div[1]"));
		for (WebElement price : allPrice) {
			System.out.println(price.getText());
		}
		driver.quit();
	}

}

package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchPriceOfAllProduct {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		// identify price of the all product
		Thread.sleep(2000);
		List<WebElement> allPrice = 
				driver.findElements(By.xpath("//a[@class='hrefch']/../../h5"));
		System.out.println(allPrice.size());
		for (WebElement price : allPrice) {
			System.out.println(price.getText());
		}
		driver.quit();
	}

}

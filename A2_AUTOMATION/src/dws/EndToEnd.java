package dws;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEnd {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//Thread.sleep(1000);
		//click on jwl link
		driver.findElement(By.partialLinkText("Jewelry")).click();
		//Thread.sleep(2000);
		//click on addTocart
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
		Thread.sleep(4000); 
		//fill the length
		driver.findElement(By.id("product_attribute_71_10_16")).sendKeys("10");
		//click on addTocart
		driver.findElement(By.id("add-to-cart-button-71")).click();
		Thread.sleep(7000);
		//click on shopping cart 
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	}

}

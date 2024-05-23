package select_single;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		//step 1
		WebElement multiSelect = driver.findElement(By.id("cars"));
		//step 2
		Select sel=new Select(multiSelect);
		//step 3
		sel.selectByIndex(1);
		Thread.sleep(1000);
		sel.selectByValue("199");
		Thread.sleep(1000);
		sel.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");
		
 		Thread.sleep(1000);
		sel.deselectByIndex(1);
		Thread.sleep(2000);
		sel.deselectAll();
	}

}

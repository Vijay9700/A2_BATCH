package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		//identify the washington
		WebElement washington = driver.findElement(By.id("box3"));
		WebElement usa = driver.findElement(By.id("box103"));
		//step 1
		Actions act=new Actions(driver); 
		//step 2
		Thread.sleep(2000);
		act.dragAndDrop(washington, usa).perform();
		
	}

}

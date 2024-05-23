   package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//identify the computers
		WebElement computers = 
				driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		//step 1-->create obj for actions class and pass driver ref
		Actions act=new Actions(driver);
		//step 2-->use actions class method
		act.moveToElement(computers).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]")).click();

	}

}

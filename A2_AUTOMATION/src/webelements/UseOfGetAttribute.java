package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetAttribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(3000);
		WebElement nameTextfield = driver.findElement(By.xpath("//input[@id='name']"));
		//click on with tool tip
		driver.findElement(By.xpath("//li[text()='With ToolTip']")).click();
		String value = nameTextfield.getAttribute("title");
		System.out.println(value);
		driver.quit();
	}
	

}

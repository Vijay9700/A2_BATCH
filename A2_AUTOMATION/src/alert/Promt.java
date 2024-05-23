package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promt {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// click on the promt button
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(1000);
		//pass the data
		driver.switchTo().alert().sendKeys("MESSAGE");
		Thread.sleep(4000);
		//click on ok button
		driver.switchTo().alert().accept();
	}

}

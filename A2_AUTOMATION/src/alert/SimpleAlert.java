package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//click on the jsalert button
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(1000);
//		//transfer the control to alert and fetch alert message
//		String msg = driver.switchTo().alert().getText();
//		System.out.println(msg);
//		//transfer the control to alert and click ok
//		driver.switchTo().alert().accept(); 
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	}

}

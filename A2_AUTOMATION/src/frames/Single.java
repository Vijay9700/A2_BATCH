package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Single {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/frames?sublist=0");
		//transfer the control to frame
		driver.switchTo().frame(0);
		//identify un and pass data
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Vj@123");
	}

}

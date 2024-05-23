package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/frames/nested?sublist=1");
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		//identify email and pass data
		driver.findElement(By.id("email")).sendKeys("wqertyu");
	}

}

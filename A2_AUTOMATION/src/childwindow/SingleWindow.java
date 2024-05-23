package childwindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//identify the button and click
		driver.findElement(By.id("newWindowBtn")).click();
		Thread.sleep(2000);
		//fetch pwid
		String pwid = driver.getWindowHandle();
		//fetch all wids
		Set<String> allWids = driver.getWindowHandles();
		Thread.sleep(2000);
		for (String cwid : allWids) {
			if(cwid.equals(pwid))
			{
			}else
			{
				driver.switchTo().window(cwid).close();
			}
			
		}
	}

}

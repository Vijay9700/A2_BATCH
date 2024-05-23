package webdriver_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetWindowHandle {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		// identify the button and click
		driver.findElement(By.id("newWindowBtn")).click();
		//fetch the parent wid
		String pwid = driver.getWindowHandle();
		System.out.println(pwid);
		//fetch all ids
		Set<String> allWids = driver.getWindowHandles();
		System.out.println(allWids);
		Thread.sleep(2000);
		driver.quit();
	}

}

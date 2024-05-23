package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetSize {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement login = driver.findElement(By.name("login"));
		//use of getSize()
		Dimension size = login.getSize();
		System.out.println(size);
		//use og getLocation
		Point loc = login.getLocation();
		System.out.println(loc);
		//use of getRect
		Rectangle rect = login.getRect();
		System.out.println(rect.height);
		System.out.println(rect.x);
		driver.quit();
	}

}

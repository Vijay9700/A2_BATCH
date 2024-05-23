package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfManage {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
//		Thread.sleep(2000);
//		//driver.manage().window().minimize();
		Dimension size = driver.manage().window().getSize();
		int height = size.getHeight();
		System.out.println(size);
		System.out.println(height);
		
	}

}

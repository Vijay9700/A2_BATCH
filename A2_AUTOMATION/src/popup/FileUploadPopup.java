package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		//identify the WE
		WebElement popup = driver.findElement(By.id("file-upload"));
		//use sendkeys
		Thread.sleep(2000);
		popup.sendKeys("C:\\Users\\qspiders kphb\\Desktop");
	}
 
}

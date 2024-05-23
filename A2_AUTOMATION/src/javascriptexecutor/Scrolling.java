package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		//step 1-->downcast
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//step2-->use JSE method
		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,400)");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(0,400)");  
		js.executeScript("window.scrollTo(0,400)");
		js.executeScript("window.scrollTo(0,400)");
	}

}

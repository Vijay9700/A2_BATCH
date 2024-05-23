package webdriver_methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfTo {
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.navigate().to("https://www.flipkart.com/");
		URL url=new URL("https://www.flipkart.com/");
		driver.navigate().to(url);
	}

}

package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {
	public static void main(String[] args) {
		//launch browser
		WebDriver driver=new ChromeDriver();
		//access fb
		driver.get("https://www.facebook.com/");
		//fetch title
		String title = driver.getTitle();
		//fetch the url
		String cUrl = driver.getCurrentUrl();
		
		//validate
		if(title.contains("Facebook") && cUrl.contains("facebook"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}

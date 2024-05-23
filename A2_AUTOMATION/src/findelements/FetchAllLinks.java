package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAllLinks {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//fetch all links
		//List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		System.out.println(allLinks);
		//iteration
		for (WebElement link : allLinks) {
			System.out.println(link.getText()); 
		}
		driver.quit();
	}

}

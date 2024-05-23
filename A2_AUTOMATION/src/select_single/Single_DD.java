package select_single;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_DD {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		//step 1--->identify the dd
		WebElement dayDropdown = driver.findElement(By.id("day"));
		//step 2--->create an obj for sselect class and pass dd ref
		Select sel=new Select(dayDropdown);
		//step 3--->use select class methods
		System.out.println(sel.isMultiple());
		Thread.sleep(1000);
		//select 26-->index
		sel.selectByIndex(25);
		Thread.sleep(1000);
		//select 7-->value
		sel.selectByValue("7");
		Thread.sleep(1000);
		//select 1-->visibletext
		sel.selectByVisibleText("1");
		//deselect 1
		sel.deselectByVisibleText("1");//USOE
	}

}

package select_single;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UseOfGetOptions {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		//step 1
		WebElement dayDD = driver.findElement(By.id("day"));
		//STEP 2
		Select sel=new Select(dayDD);
		//step 3
		List<WebElement> allOptions = sel.getOptions();
		System.out.println(allOptions.size());
		System.out.println(allOptions);
//		for(int i=0;i<allOptions.size();i++)
//		{
//			sel.selectByIndex(i) ;
//		}
		
		for (WebElement option : allOptions) {
//			String text = option.getText();
//			sel.selectByVisibleText(text);
			String value = option.getAttribute("value");
			sel.selectByValue(value);
		}
	}

}

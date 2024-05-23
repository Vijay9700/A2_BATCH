package childwindow;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/products_page/4");
		Thread.sleep(40000);
		driver.findElement(By.xpath("//*[name()='svg' and @class='MuiSvgIcon-root MuiSvgIcon-colorPrimary MuiSvgIcon-fontSizeMedium css-2c7buj' ]")).click();
		//parent wid
		String pwid = driver.getWindowHandle();
		//fetch wid
		Set<String> allWids = driver.getWindowHandles();
		for (String cwid : allWids) {
			String title = driver.switchTo().window(cwid).getTitle();
			System.out.println(title);
			if(title.contains("eBay"))
			{
				driver.close();
			}
		}
		
	}

}

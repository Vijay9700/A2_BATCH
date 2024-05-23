package shopperstack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC03_SS_Men {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void men(String browser) throws InterruptedException {
		//WebDriver driver = new ChromeDriver();
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("internetexplorer"))
		{
			driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		// click on login in welcome page
		driver.findElement(By.id("loginBtn")).click();
		// enter email
		driver.findElement(By.id("Email")).sendKeys("leodas@gmail.com");
		// enter password
		driver.findElement(By.id("Password")).sendKeys("Leodas@123");
		// click on login button in login page
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		//click on men
		driver.findElement(By.xpath("//a[text()='Men']")).click();
		//refresh
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		//click on first product
		driver.findElement(By.xpath("(//button[text()='add to cart'])[1]")).click();
		driver.quit();
	}

}

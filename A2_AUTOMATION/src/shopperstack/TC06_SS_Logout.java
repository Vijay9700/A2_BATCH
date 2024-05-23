 package shopperstack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC06_SS_Logout {
	
	@Test(groups = "integration")
	public void logout() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		// click on login in welcome page
		driver.findElement(By.id("loginBtn")).click();
		//enter email
		driver.findElement(By.id("Email")).sendKeys("leodas@gmail.com");
		//enter password
		driver.findElement(By.id("Password")).sendKeys("Leodas@123");
		//click on login  button in login page
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		//click on profile icon
		driver.findElement(By.xpath("//*[name()='svg' and @data-testid='SettingsIcon']")).click();
		//click on logout
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[@tabindex='-1'])[7]")).click();
		driver.quit();
	}

}

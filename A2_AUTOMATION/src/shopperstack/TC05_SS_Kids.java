package shopperstack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC05_SS_Kids {

	@Test(groups = "smoke")
	public void kids() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
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
		// click on kids
		driver.findElement(By.xpath("//a[text()='Kids']")).click();
		//refresh
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		//click on first product
		driver.findElement(By.xpath("//span[text()='santoor']")).click();
		//fetch current price
		WebElement cprice = driver.findElement(By.xpath("//h2[text()='santoor']/../../div[5]/div/p/span[1]"));
		System.out.println(cprice.getText());
		driver.quit();
	}
}

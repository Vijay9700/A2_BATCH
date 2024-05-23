package takescreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SS_Facebook {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// identify the email and pass data
		driver.findElement(By.id("email")).sendKeys("vijay@gmail.com");
		// take ss of email
		// step 1-->downcast
		TakesScreenshot ts = (TakesScreenshot) driver;
		// step 2-->take ss using gSsAs() and store temp
		File tempEmail = ts.getScreenshotAs(OutputType.FILE);
		// step 3--->create perm loc to store ss
		File permEmail = new File("./  /email.png");
		// step 4-->copy
		FileHandler.copy(tempEmail, permEmail);
		
		//identify password and pass data
		driver.findElement(By.id("pass")).sendKeys("vj@123");
		File tempPass = ts.getScreenshotAs(OutputType.FILE);
		File permPass = new File("./screenshot/pwd.png");
		FileHandler.copy(tempPass, permPass);
		
		//identify login button and click
		driver.findElement(By.name("login")).click();
		Thread.sleep(15000);
		File tempLogin = ts.getScreenshotAs(OutputType.FILE);
		File permLogin = new File("./screenshot/login.png");
		FileHandler.copy(tempLogin, permLogin);
		driver.quit();
	}

}

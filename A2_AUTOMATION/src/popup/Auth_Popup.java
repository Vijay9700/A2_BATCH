package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auth_Popup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}

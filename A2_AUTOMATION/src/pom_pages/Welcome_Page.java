package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//step 1-->create class as same as webpage name
public class Welcome_Page {
	// step 2--->create a public parameterized constructor
	public Welcome_Page(WebDriver driver) {
		// step 4--->initialize the webelement
		PageFactory.initElements(driver, this);
	}

	// step 3--->identify the webelement
	@FindBy(id = "loginBtn")
	private WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}

	@FindBy(id = "men")
	private WebElement men;

	public WebElement getMen() {
		return men;
	}

}

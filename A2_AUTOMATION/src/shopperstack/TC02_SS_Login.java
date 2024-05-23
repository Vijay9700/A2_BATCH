package shopperstack;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pom_pages.Welcome_Page;
import utilities.ExelUtility;
import utilities.PropertiesUtility;

public class TC02_SS_Login {
	// WebDriver driver;
	@Test(groups = "functional")
	// @Parameters("browser")
	public void login() throws IOException {
		WebDriver driver = new ChromeDriver();
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//			driver=new ChromeDriver();
//		}
//		else if(browser.equalsIgnoreCase("edge"))
//		{
//			driver=new EdgeDriver();
//		}
//		else if(browser.equalsIgnoreCase("internetexplorer"))
//		{
//			driver=new InternetExplorerDriver();
//		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		// driver.get("https://shoppersstack.com/");

		// read data from properties and access SS
//		// step 1-->get the object of properties file
//		FileInputStream fis = 
//		new FileInputStream("./commondata/A2Commondata.properties");
//		// step 2-->load the properties file
//		Properties prop = new Properties();
//		prop.load(fis);
//		// step 3-->read the data
//		String url = prop.getProperty("URL");
		
		PropertiesUtility property=new PropertiesUtility();
		String url = property.readDataFromProperties("URL");
		driver.get(url);
		
		// click on login in welcome page
		//driver.findElement(By.id("loginBtn")).click();
		Welcome_Page welcome=new Welcome_Page(driver);
		welcome.getLoginButton().click();
//		// enter email
//		driver.findElement(By.id("Email")).sendKeys("leodas@gmail.com");
//		// enter password
//		driver.findElement(By.id("Password")).sendKeys("Leodas@123");

		// read data from excel
//		// step 1--->get the obj of excel file
//		FileInputStream fis1 = new FileInputStream("./testscriptdata/logindata.xlsx");
//		// step 2--->open excel in read mode
//		Workbook workbook = WorkbookFactory.create(fis1);
//		// step 3--->get the sheet control
//		Sheet sheet = workbook.getSheet("login");
//		// step 4--->get row control
//		Row row = sheet.getRow(1);
//		// step 5--->get cell control
//		Cell cell = row.getCell(0);
//		// step 6--->read the data
//		String email = cell.getStringCellValue();
//		//read pwd
//		Row row1 = sheet.getRow(1);
//		// step 5--->get cell control
//		Cell cell1 = row.getCell(1);
//		// step 6--->read the data
//		String pwd = cell.getStringCellValue();
		ExelUtility excel=new ExelUtility();
		String email = excel.readDataFromExcel("login", 1, 0);
		String pwd = excel.readDataFromExcel("login", 1, 1);
		
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		
		// click on login button in login page
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.quit();
	}

}

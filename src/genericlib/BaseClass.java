package genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Object_Repo.HomePage;
import Object_Repo.LoginPages;

public class BaseClass
{
	public static WebDriver driver = null;
	public PropertiesUtilorLib PUTIL = null;
	public SeleniumUtility SUTIL = new SeleniumUtility();
	
	@BeforeSuite
	public void createDbConnection()
	{
		System.out.print("db connection successfull!!");
	}
	@BeforeClass
	public void lanchBrowser() throws Exception
	{
		PUTIL = new PropertiesUtilorLib();
		String URL = PUTIL.getDatafromproperties("url");
		driver = new ChromeDriver();
		SUTIL.implicitlyWait(driver, 10);
		SUTIL.maximizeWindow(driver);
		driver.get(URL);
		System.out.println("lanching Successfully");
	}
	@BeforeMethod
	public void loginOperation() throws Exception
	{
		String USERNAME = PUTIL.getDatafromproperties("username");
		String PASSWORD = PUTIL.getDatafromproperties("password");
		LoginPages lp = new LoginPages(driver);
		lp.LoginOparation(USERNAME,PASSWORD);
		System.out.print("logint successfully");
	}
	@AfterMethod
	public void logoutOperation()
	{
		HomePage hp = new HomePage(driver);
	}
}

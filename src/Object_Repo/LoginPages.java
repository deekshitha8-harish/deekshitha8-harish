package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import objectRepository.FindBy;

public class LoginPages 
{
	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='submitButton']")
	private WebElement login;
	
	public LoginPages(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	public void LoginOparation(String uname, String pass)
	{
		username.sendKeys(uname);
		password.sendKeys(pass);
		login.click();
	}
}

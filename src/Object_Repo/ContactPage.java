package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage 
{
	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement CreateNewcontactbutton;
	
	public WebElement getCreatecontactbutton()
	{
		return CreateNewcontactbutton;
	}
	public ContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnCreateNewcontactbutton()
	{
		CreateNewcontactbutton.click();
	}
}	
	

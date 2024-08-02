package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import ObjectRepository.FindBy;

public class LeadPage 
{
	@FindBy(xpath = "//img[@title='Create Lead...']")
	private WebElement createNewLeadButton;
	
	public LeadPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public WebElement getCreateNewLeadButton()
	{
		return createNewLeadButton;
	}
	public void clickOnCreateLeadButton()
	{
		createNewLeadButton.click();
	}
}

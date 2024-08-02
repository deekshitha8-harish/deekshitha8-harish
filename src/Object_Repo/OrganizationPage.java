package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage 
{
	@FindBy(xpath = "//img[@alt='Create Organization...']")
	private WebElement createNewOrgButton;
	
	public WebElement getCreateNewOrgButton()
	{
		return createNewOrgButton;
	}
	public OrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOncreateOrgButton()
	{
		createNewOrgButton.click();
	}
}

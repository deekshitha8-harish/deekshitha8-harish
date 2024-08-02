package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactPage 
{
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement LastName;
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement title;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement SaveBtn;
	
	public CreateNewContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	public void createContact(String fName,String lName,String ttl)
	{
		FirstName.sendKeys(fName);
		LastName.sendKeys(lName);
		title.sendKeys(ttl);
		SaveBtn.click();
	}
	
}

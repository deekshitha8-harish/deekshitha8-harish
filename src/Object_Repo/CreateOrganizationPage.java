package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage 
{
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement OrgName;
	
	@FindBy(xpath="//input[@name='website']")
	private WebElement Website;
	
	@FindBy(xpath="//input[@name='employees']")
	private WebElement Employees;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement Phone;
	
	@FindBy(xpath="//input[@name='otherphone']")
	private WebElement OtherPhone;
	
	@FindBy(xpath="//input[@name='email1']")
	private WebElement Email;
	
	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement BillingAddress;
	
	@FindBy(xpath="//input[@name='bill_city']")
	private WebElement BillingCity;
	
	@FindBy(xpath="//input[@name='bill_state']")
	private WebElement BillingState;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
	private WebElement SaveBtn;
	
	public CreateOrganizationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getOrgName()
	{
		return OrgName;
	}
	public WebElement getWebsite() {
		return Website;
	}
	public WebElement getEmployees() {
		return Employees;
	}
	public WebElement getPhone() {
		return Phone;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getBillingAddress() {
		return BillingAddress;
	}
	public WebElement getBillingCity() {
		return BillingCity;
	}
	public WebElement getBillingState() {
		return BillingState;
	}
	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	public void createOrganization(String orgName,String website,String employees)
	{
		OrgName.sendKeys(orgName);
		Website.sendKeys(website);
		Employees.sendKeys(employees);
		SaveBtn.click();
	}
	public void createOrganization(String orgName,String website,String phone,String otherPhone,String mailId)
	{
		OrgName.sendKeys(orgName);
		Website.sendKeys(website);
		Phone.sendKeys(phone);
		OtherPhone.sendKeys(otherPhone);
		Email.sendKeys(mailId);
		SaveBtn.click();
	}
	public void createOrganization(String orgName,String website,String employees,String Baddress,String Bcity,String Bstate)
	{
		OrgName.sendKeys(orgName);
		Website.sendKeys(website);
		Employees.sendKeys(employees);
		BillingAddress.sendKeys(Baddress);
		BillingCity.sendKeys(Bcity);
		BillingState.sendKeys(Bstate);
		SaveBtn.click();
	}
	public void createOrganization(String orgName,String website,String phone,String otherPhone,String mailId,String Baddress,String Bcity,String Bstate)
	{
		OrgName.sendKeys(orgName);
		Website.sendKeys(website);
		Phone.sendKeys(phone);
		OtherPhone.sendKeys(otherPhone);
		Email.sendKeys(mailId);
		BillingAddress.sendKeys(Baddress);
		BillingCity.sendKeys(Bcity);
		BillingState.sendKeys(Bstate);
		SaveBtn.click();
	}
}

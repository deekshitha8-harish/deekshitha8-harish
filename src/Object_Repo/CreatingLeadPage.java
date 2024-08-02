package Object_Repo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatingLeadPage 
{
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement company;
	
	@FindBy(xpath="//input[@name='designation']")
	private WebElement title;
	
	@FindBy(xpath="//input[@name='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='noofemployees']")
	private WebElement noOffEmp;
	
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement street;
	
	@FindBy(xpath="//input[@name='pobox']")
	private WebElement poBox;
	
	@FindBy(xpath="//input[@name='code']")
	private WebElement postalCode;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@name='country']")
	private WebElement country;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement state;
	
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[2]")
	private WebElement saveBtn;
	public CreatingLeadPage(WebDriver driver)
	{
		
	}
	public void createLead(String fname,String lname,String comp)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(comp);
		saveBtn.click();
	}
	public void createLead(String fname,String lname,String comp,String desg,String phno,String mob,
			String mailId, String employees,String Strt,String pb,String postcode,String cty,String cntry,String st)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(comp);
		title.sendKeys(desg);
		phone.sendKeys(phno);
		mobile.sendKeys(mob);
		email.sendKeys(mailId);
		noOffEmp.sendKeys(employees);
		street.sendKeys( Strt);
		poBox.sendKeys(pb);
		postalCode.sendKeys(postcode);
		city.sendKeys(cty);
		country.sendKeys(cty);
		state.sendKeys(st);
		saveBtn.click();	
	}
	public void createLead(String fname,String lname,String comp,String desg,String phno,String mob,
			String mailId,String employees)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(comp);
		title.sendKeys(desg);
		phone.sendKeys(phno);
		mobile.sendKeys(mob);
		email.sendKeys(mailId);
		noOffEmp.sendKeys(employees);
		saveBtn.click();
	}
	public void createLead(String fname,String lname,String comp,String Strt,String pb,String postcode,String cty,String cntry,String st)
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		company.sendKeys(comp);
		street.sendKeys( Strt);
		poBox.sendKeys(pb);
		postalCode.sendKeys(postcode);
		city.sendKeys(cty);
		country.sendKeys(cty);
		state.sendKeys(st);
		saveBtn.click();	
	}
}

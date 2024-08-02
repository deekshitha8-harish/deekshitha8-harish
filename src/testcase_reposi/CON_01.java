package testcase_reposi;

import org.testng.annotations.Test;

import Object_Repo.ContactPage;
import Object_Repo.CreateNewContactPage;
import Object_Repo.HomePage;
import genericlib.BaseClass;
import genericlib.ExcelUtilityorLib;
import genericlib.JavaLibrary;
import genericlib.ReadDataFromExcel;

public class CON_01 extends BaseClass
{
	@Test(retryAnalyzer = genericlib.RetryAnalyzerImplementationClass.class)
	public void con_01() throws Exception
	{
		JavaLibrary JLIB = new JavaLibrary();
		int num = JLIB.generateRandomNumber(1000);
		ExcelUtilityorLib  EUTIL= new ExcelUtilityorLib ();
		String FNAME = EUTIL.ReadingDataFromExcel("Contact", 2, 1);
		String LNAME = EUTIL.ReadingDataFromExcel("Contact", 2, 2);
		String TITLE = EUTIL.ReadingDataFromExcel("Contact", 2, 3);
		
		HomePage HP = new HomePage(driver);
		HP.clickOnContacts();
		
		ContactPage CP = new ContactPage(driver);
		CP.clickOnCreateNewcontactbutton();
		
		CreateNewContactPage CNC = new CreateNewContactPage(driver);
		CNC.createContact(FNAME+num,LNAME,TITLE);
		Thread.sleep(3000);
	}
}

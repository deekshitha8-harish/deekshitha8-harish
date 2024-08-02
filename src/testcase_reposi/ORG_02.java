package testcase_reposi;

import genericlib.ExcelUtilityorLib;
import genericlib.JavaLibrary;

public class ORG_02 
{
	public void ORG_02() throws Exception
	{
		JavaLibrary JUTIL = new JavaLibrary();
		int num = JUTIL.generateRandomNumber(1000);
		ExcelUtilityorLib  EUTIL = new ExcelUtilityorLib ();
		String ORGNAME = EUTIL.ReadingDataFromExcel("Oganization",5,1);
		String ORGNAME = EUTIL.ReadingDataFromExcel("Oganization",5,1);
		String ORGNAME = EUTIL.ReadingDataFromExcel("Oganization",5,1);
		String ORGNAME = EUTIL.ReadingDataFromExcel("Oganization",5,1);
		String ORGNAME = EUTIL.ReadingDataFromExcel("Oganization",5,1);
	}
}

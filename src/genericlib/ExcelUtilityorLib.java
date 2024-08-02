package genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilityorLib 
{
	public String ReadingDataFromExcel(String SheetName,int rowNum,int cellNum) throws Exception 
	{
		FileInputStream fis = new FileInputStream(IconstantUtility.excelpath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(SheetName);
		DataFormatter format = new DataFormatter();
		String value = format.formatCellValue(sh.getRow(rowNum).getCell(cellNum));
		return value;
	}
}

package genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\selenium\\m6TestCaseData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sample");
		//Row r = sh.getRow(3);
		//Cell c = r.getCell(2);
		//String value =c.getStringCellValue();
		String value1 = sh.getRow(3).getCell(2).getStringCellValue();
		System.out.print(value1);
	}
}

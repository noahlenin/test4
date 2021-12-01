package file_Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelFileUtility {
	@Test
	public String readFromExcelFile(String sheet,int row,int column) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream fs=new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb=WorkbookFactory.create(fs);
		String cellvalue = wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
		return cellvalue;
	}
	

}

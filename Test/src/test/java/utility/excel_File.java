package utility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import file_Utility.ExcelFileUtility;

public class excel_File {
	@Test
	public void login_excel() throws EncryptedDocumentException, IOException
	{
		ExcelFileUtility fs=new ExcelFileUtility();
		String excel = fs.readFromExcelFile("Sheet1", 1, 0);
		System.out.println(excel);
		
		
		
	}

}

package DataDriven;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class from_Excel {

	public static void main(String[] args) throws Throwable {
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\noahl\\eclipse-workspace\\Test\\excel.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		/*Row row = sh.getRow(1);
		Cell cell = row.getCell(0);
		String data = cell.getStringCellValue();*/
		
		for(int i=1;i<=3;i++) {
			for(int j=0;j<=1;j++) {
				
				String data=sh.getRow(i).getCell(j).getStringCellValue();
				
				System.out.println(data);
			}
		}
		
			}

}

package file_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFileUtility {
@Test
	public String readDataFromProperty(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\noahl\\eclipse-workspace\\Test\\common.properties.txt");
		Properties pf=new Properties();
		pf.load(fis);
		String value = pf.getProperty(key);
		return value;
		
	}
}

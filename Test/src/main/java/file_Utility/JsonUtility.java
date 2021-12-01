package file_Utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class JsonUtility {
	@Test
	public String readDataFromJson(String key) throws IOException, ParseException
	{
		FileReader file=new FileReader(IPathConstants.JsonPath);
		JSONParser jp=new JSONParser();
		Object javaobj=jp.parse(file);
		HashMap map=(HashMap) javaobj;
		String value = map.get(key).toString();
		return value;
		
		
		
	}
	
	
		
		
	
	
	

}

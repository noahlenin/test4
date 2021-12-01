package DataDriven;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JsonUtility {
//	@BeforeMethod 
	public String jsonfile(String key) throws IOException, ParseException {
		FileReader fr=new FileReader("C:\\Users\\noahl\\eclipse-workspace\\Test\\common_json.json");
		JSONParser jp=new JSONParser();
		Object javaobj=jp.parse(fr);
		HashMap map=(HashMap) javaobj;
		String value=(String) map.get(key);
		return value;
		
		
		
		
	}

}

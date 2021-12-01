package DataDriven;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class from_Json {

	public static void main(String[] args) throws IOException, ParseException {
		
		FileReader jsonFile=new FileReader("C:\\Users\\noahl\\eclipse-workspace\\Test\\common_json.json");
		JSONParser  jparser=new JSONParser();
		Object javaobj=jparser.parse(jsonFile);
		HashMap map=(HashMap) javaobj;
		String URL = map.get("url").toString();
		String un = map.get("username").toString();
		String pass = map.get("password").toString();
		
		
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
	
		
		

	}

}
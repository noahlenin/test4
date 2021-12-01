package Practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Base_Class.Base__Class;

public class test1 extends Base__Class {

	
	@Test
	public void tc1() {
		
		WebElement ele = driver.findElement(By.xpath("(//a[text()='Organizations'])[1]"));
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		
		
		driver.findElement(By.name("accounttype"));
		Select sel=new Select(driver.findElement(By.name("accounttype")));
		sel.selectByVisibleText("Banking");
		
				

	}

}

package seleniumtraining;

import org.openqa.selenium.By;

import pageobject.LoginPage;
import pageobject.SelectItem;

public class TestCase3 extends TestCaseBase{
	
	public void selectItem()
	{
		setup();
		driver.findElement(SelectItem.img_link).click();
		driver.findElement(SelectItem.add_to_cart).click();
		
		//teardown();
		
	}
}

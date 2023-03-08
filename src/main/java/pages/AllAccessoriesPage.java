package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllAccessoriesPage extends PageBase {

	public AllAccessoriesPage(WebDriver driver) {
		super(driver);
		
	}

	
	public void goToEyeWearPage ()
	{
		WebElement eyeWearLink = driver.findElement(By.linkText("EYEWEAR")) ;
		clickBtn(eyeWearLink);
	}
	
}

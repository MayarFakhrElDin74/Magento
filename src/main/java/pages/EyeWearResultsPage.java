package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EyeWearResultsPage extends PageBase {

	public EyeWearResultsPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void goToAddToCartPage ()
	
	{
		WebElement addToCartLink = 
		driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/ul/li/div/div[2]/button/span/span")) ;
		clickBtn(addToCartLink) ;
		
	}

}

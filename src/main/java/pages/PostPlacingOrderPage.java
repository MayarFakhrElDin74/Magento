package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PostPlacingOrderPage extends PageBase {

	public PostPlacingOrderPage(WebDriver driver) {
		super(driver);
		
	}

	public void returnToHomePage ()
	
	{
		String purchasenotification = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div/h2")).getText() ; ;
		System.out.println(purchasenotification) ;
		
		WebElement logoLink = driver.findElement(By.cssSelector("img.large")) ;
		clickBtn(logoLink) ;
	
	}
	
}

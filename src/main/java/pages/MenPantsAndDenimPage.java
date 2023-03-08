package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenPantsAndDenimPage extends PageBase{

	public MenPantsAndDenimPage(WebDriver driver) {
		super(driver);
		
	}

	public void goToProductDetailsPage ()
	
	{
		WebElement viewDetailsBtn =
		driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/ul/li[2]/div/div[2]/a")) ;
		
		clickBtn(viewDetailsBtn) ;
		
	}
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPage extends PageBase  {

	public AddToCartPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public void increaseProductQuantity (String productquantity)
	
	{
		WebElement quantityBox = driver.findElement(By.cssSelector("input.input-text.qty")) ;
		clickBtn(quantityBox) ;
		quantityBox.clear();
		setTextElementText(quantityBox, productquantity) ;
		quantityBox.submit();
		
		 
	}
	
	public void proceedToCheckout ()
	
	{
		WebElement proceedToCheckoutBtn =
		driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div/div[2]/div[1]/ul/li/button/span/span")) ;
		
		clickBtn(proceedToCheckoutBtn) ;
		
	}

}

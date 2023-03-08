package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToWishListPage extends PageBase {

	public AddToWishListPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void addToWishList ()
	
	{
		
	WebElement addToWishListLink = driver.findElement(By.linkText("Add to Wishlist")) ;
	clickBtn(addToWishListLink);
		
	
	}
	
	
	public void confirmAddingToWishlist ()
	
	{
		
		String wishlistnotification = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/ul/li/ul/li")).getText() ;
		System.out.println(wishlistnotification) ;
		
	}

	
}

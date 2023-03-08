package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage extends PageBase {

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void openAddReview ()
	
	{
		WebElement reviewsTab = 
	    driver.findElement(By.xpath("//*[@id=\"top\"]/body/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[2]/ul/li[3]/span")) ;
		clickBtn(reviewsTab) ;
		
		WebElement firstReviewLink = driver.findElement(By.linkText("Be the first to review this product")) ;
		clickBtn(firstReviewLink) ;
	
	}

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddReviewPage extends PageBase {

	public AddReviewPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	public void addReview (String reviewtxt , String summaryreviewtxt , String nicknametxt)
	
	{
		
		WebElement priceRatingBtn = driver.findElement(By.id("Price_4")) ;
		clickBtn(priceRatingBtn);
		
		WebElement valueRatingBtn = driver.findElement(By.id("Value_4")) ;
		clickBtn(valueRatingBtn);
		
		WebElement qualityRatingBtn = driver.findElement(By.id("Quality_5")) ;
		clickBtn(qualityRatingBtn);
		
		WebElement yourThoughtsTxtBox = driver.findElement(By.id("review_field")) ;
		setTextElementText(yourThoughtsTxtBox, reviewtxt);
		
		WebElement summaryReviewTxtBox = driver.findElement(By.id("summary_field")) ;
		setTextElementText(summaryReviewTxtBox, summaryreviewtxt);
		
		WebElement yourNickNameTxtBox = driver.findElement(By.id("nickname_field")) ;
		setTextElementText(yourNickNameTxtBox, summaryreviewtxt);
		
		WebElement submitReviewBtn = driver.findElement(By.xpath("//*[@id=\"review-form\"]/div[2]/button/span/span")) ;
		clickBtn(submitReviewBtn) ;
		
		String reviewnotification = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/ul/li/ul/li/span")).getText() ;
		System.out.println(reviewnotification) ;
		
	}
	
}

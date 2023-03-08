package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage extends PageBase {

	public ContactUsPage(WebDriver driver) {
		super(driver);
		
	}

	public void contactUs ( String username , String email , String comment)
	
	{
		
		WebElement nameTxtBox = driver.findElement(By.id("name")) ;
		setTextElementText(nameTxtBox, username);
		
		WebElement emailTxtBox = driver.findElement(By.id("email")) ;
		setTextElementText(emailTxtBox, email);
		
		WebElement commentTxtBox = driver.findElement(By.id("comment")) ;
		setTextElementText(commentTxtBox, comment);
		
		WebElement submitBtn = driver.findElement(By.xpath("//*[@id=\"contactForm\"]/div[2]/button/span/span")) ;
		clickBtn(submitBtn) ;
		
		String contactussuccessmsg = driver.findElement(By.xpath("//*[@id=\"messages_product_view\"]/ul/li/ul/li/span")).getText() ;
		System.out.println(contactussuccessmsg) ;
		
	}
	
}

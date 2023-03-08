package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginCheckoutPage extends PageBase {

	public LoginCheckoutPage(WebDriver driver) {
		super(driver);

	}

	
	public void loginToCheckout (String email , String password)

	{

		WebElement emailCheckoutTxtBox = driver.findElement(By.id("login-email")) ;
		setTextElementText(emailCheckoutTxtBox, email);

		WebElement passwordCheckoutTxtBox = driver.findElement(By.id("login-password")) ;
		setTextElementText(passwordCheckoutTxtBox, password);

		WebElement loginCheckoutBtn = 
		driver.findElement(By.xpath("//*[@id=\"checkout-step-login\"]/div/div[2]/div/button/span/span")) ;
		clickBtn(loginCheckoutBtn) ;

	}

}

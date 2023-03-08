package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends PageBase {



	public RegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	

	public void UserRegister (String firstname , String lastname , String email , String password )
	
	
	{
		
		WebElement firstNameTxtBox = driver.findElement(By.id("firstname")) ;
		setTextElementText(firstNameTxtBox, firstname);
		
		WebElement lastNameTxtBox = driver.findElement(By.id("lastname")) ;
		setTextElementText(lastNameTxtBox, lastname);
		
		WebElement emailTxtBox = driver.findElement(By.id("email_address")) ;
		setTextElementText(emailTxtBox, email);
		System.out.println(email);
		
		WebElement passwordTxtBox = driver.findElement(By.id("password")) ;
		setTextElementText(passwordTxtBox, password);
		System.out.println(password);
		
		WebElement confirmPasswordTxtBox = driver.findElement(By.id("confirmation")) ;
		setTextElementText(confirmPasswordTxtBox, password);
		
		WebElement registerBtn = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div[2]/button/span/span")) ;
		clickBtn(registerBtn);
		
		String registerationmsg = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div/div/ul/li/ul/li/span")).getText() ;
		System.out.println(registerationmsg) ;
			
	}

		
}

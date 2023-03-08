package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
public void registeredUserLogin (String email , String password)


{
	
	WebElement emailTxtBox = driver.findElement(By.id("email")) ;
	setTextElementText(emailTxtBox, email);
	
	WebElement passwordTxtBox = driver.findElement(By.id("pass")) ;
	setTextElementText(passwordTxtBox, password);
	
	WebElement loginBtn = driver.findElement(By.id("send2")) ;
	clickBtn(loginBtn) ;
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000)) ;
	
	String welcomemsg = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[1]/div/p")).getText();
	System.out.println(welcomemsg) ;
	
}


}

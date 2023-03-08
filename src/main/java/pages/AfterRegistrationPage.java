package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AfterRegistrationPage extends PageBase {

	public AfterRegistrationPage(WebDriver driver) {
		super(driver);
		
	}

	public void registeredUserLogout ()
	{
		
		WebElement accountMenu = driver.findElement(By.linkText("ACCOUNT")) ;
		clickBtn(accountMenu);

		WebElement logoutLink = driver.findElement(By.linkText("Log Out")) ;
		clickBtn(logoutLink) ;
		
		String logoutmsg = driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div/p")).getText() ;
		System.out.println(logoutmsg) ;
	
	}

}

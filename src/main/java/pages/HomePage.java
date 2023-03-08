package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		
		jse = (JavascriptExecutor) (driver) ;

	}
			

	public void goToRegistrationPage ()
	{
		WebElement accountMenu = driver.findElement(By.linkText("ACCOUNT")) ;
		clickBtn(accountMenu);

		WebElement registerLink = driver.findElement(By.linkText("Register")) ;
		clickBtn(registerLink);
	}


	public void changeLanguageToFrench ()

	{
		
		WebElement languagesList = driver.findElement(By.id("select-language")) ;


		Select select = new Select(languagesList) ;
		select.selectByVisibleText("French");

		String yourlanguagefrench = 
		driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[1]/div/div/div/label")).getText() ;
		System.out.println(yourlanguagefrench) ;
		
	}
	
	

	public void returnLanguageToEnglish ()
	
	{
		WebElement languagesList = driver.findElement(By.id("select-language")) ;

		Select select = new Select(languagesList) ;
		select.selectByVisibleText("English");

		String yourlanguageenglish =
	    driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[1]/div/div/div/label")).getText() ;
		System.out.println(yourlanguageenglish) ;

	}
	
	
	public void goToLoginPage ()
	
	{
		WebElement accountMenu = driver.findElement(By.linkText("ACCOUNT")) ;
		clickBtn(accountMenu);
		
		WebElement loginLink = driver.findElement(By.linkText("Log In")) ;
		clickBtn(loginLink);
		
	}
	
	public void goToBooksAndMusicPage ()
	
	{
		WebElement homeAndDecorLink = driver.findElement(By.linkText("HOME & DECOR")) ;
		action= new Actions(driver) ;
		action.moveToElement(homeAndDecorLink).build().perform() ;
		
		WebElement booksAndMusciLink = driver.findElement(By.linkText("Books & Music")) ;
		action.moveToElement(booksAndMusciLink).click().build().perform();
		
	}
	
	
	public void goToContactUsPage ()
	
	{
		scrollToBottom();
		
		WebElement contactUsLink = driver.findElement(By.linkText("CONTACT US")) ;
		clickBtn(contactUsLink);
	}
	
	
	public void searchProduct (String firstproductname)
	
	{
		WebElement searchBox = driver.findElement(By.id("search")) ;
		setTextElementText(searchBox, firstproductname);
		searchBox.submit();
		
		System.out.println(firstproductname);
		
	}

	 public void goToAllAccessoriesPage ()
	 
	 {
		 WebElement accessoriesMenu = driver.findElement(By.linkText("ACCESSORIES")) ;
		 
		 action = new Actions(driver) ;
		 action.moveToElement(accessoriesMenu).build().perform(); ;
		 
		 WebElement viewAllAccessoriesLink = driver.findElement(By.linkText("View All Accessories")) ;
		 action.moveToElement(viewAllAccessoriesLink).click().build().perform();
		 
	 }
	 
	 
	 public void goToMenPantsAndDenimPage ()
	 
	 {
		 WebElement MenMenu = driver.findElement(By.linkText("MEN")) ;
		 action = new Actions(driver) ;
		 action.moveToElement(MenMenu).build().perform();
		 
		 WebElement pantsAndDenimLink = driver.findElement(By.linkText("Pants & Denim")) ;
		 action.moveToElement(pantsAndDenimLink).click().build().perform();  
		 
	 }
	
	
}

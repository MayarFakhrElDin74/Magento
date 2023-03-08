package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BooksAndMusicProductsPage extends PageBase {

	public BooksAndMusicProductsPage(WebDriver driver) {
		super(driver);
		
	}

	public void sortByPrice ()
	{
		WebElement sortByList = 
		driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[2]/div[1]/div[1]/div/select")) ;
		
		select = new Select(sortByList) ;
		select.selectByVisibleText("Price") ;
		
	}

	
	public void goToProductDetailsPage ()
	
	{
		
		WebElement productLink = driver.findElement(By.linkText("IF YOU WERE BY KESHCO")) ;
		clickBtn(productLink) ;
		
	}
}


